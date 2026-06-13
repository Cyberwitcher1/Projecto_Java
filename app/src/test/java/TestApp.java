import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestApp {

    /*
     * Tempo máximo permitido para cada teste.
     * Caso seja ultrapassado, o processo é terminado.
     */
    private static final Duration TIMEOUT =
            Duration.ofSeconds(5);

    /*
     * Classe principal da aplicação.
     */
    private static final String APP_MAIN_CLASS =
            "atec.poo.loja.app.App";

    /*
     * Pastas utilizadas pelos testes.
     *
     * A configuração do IntelliJ deverá utilizar:
     *
     * Working directory:
     * $PROJECT_DIR$/app
     */
    private static final Path TEST_DIR =
            Path.of("src", "test", "java");

    private static final Path INPUT_DIR =
            TEST_DIR.resolve("in");

    private static final Path EXPECTED_OUTPUT_DIR =
            TEST_DIR.resolve("out");

    private static final Path GENERATED_OUTPUT_DIR =
            TEST_DIR.resolve("myout");

    /*
     * Pasta onde são guardados stack traces e outputs indevidos
     * enviados diretamente para System.out.
     */
    private static final Path ERROR_DIR =
            GENERATED_OUTPUT_DIR.resolve("errors");

    public static void main(String[] args)
            throws Exception {

        ensureDirectories();

        List<Path> inputFiles =
                findInputFiles();

        if (inputFiles.isEmpty()) {
            System.out.println(
                    "Não foram encontrados ficheiros de teste em: "
                            + INPUT_DIR.toAbsolutePath()
            );

            return;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                printHeader();

                List<Path> selectedTests =
                        askTests(
                                scanner,
                                inputFiles
                        );

                /*
                 * Uma lista vazia significa que foi escolhida
                 * a opção de saída.
                 */
                if (selectedTests.isEmpty()) {
                    System.out.println();
                    System.out.println(
                            "Execução terminada."
                    );

                    return;
                }

                /*
                 * Antes de cada execução são eliminados todos
                 * os resultados anteriores.
                 */
                cleanGeneratedResults();

                executeSelectedTests(
                        selectedTests
                );

                System.out.println();
                System.out.println(
                        "Prima ENTER para continuar..."
                );

                scanner.nextLine();
            }
        }
    }

    /*
     * Apresenta o cabeçalho principal.
     */
    private static void printHeader() {
        System.out.println();
        System.out.println(
                "=========================================="
        );
        System.out.println(
                " TESTES AUTOMÁTICOS — LOJA DA ATEC"
        );
        System.out.println(
                "=========================================="
        );
    }

    /*
     * Apresenta os testes disponíveis e pergunta quais devem
     * ser executados.
     *
     * ENTER ou T -> todos os testes
     * 3          -> apenas o terceiro teste
     * 1,3,4      -> testes 1, 3 e 4
     * 0          -> sair
     */
    private static List<Path> askTests(
            Scanner scanner,
            List<Path> inputFiles
    ) {
        while (true) {
            System.out.println();
            System.out.println(
                    "Testes disponíveis:"
            );

            for (int index = 0;
                 index < inputFiles.size();
                 index++) {

                Path inputFile =
                        inputFiles.get(index);

                System.out.printf(
                        "%d - %s%n",
                        index + 1,
                        removeExtension(
                                inputFile
                                        .getFileName()
                                        .toString()
                        )
                );
            }

            System.out.println();
            System.out.println(
                    "Indica os testes a executar:"
            );
            System.out.println(
                    "  T           -> Todos os testes"
            );
            System.out.println(
                    "  3           -> Apenas um teste (ex. 3) - Usa o número do teste"
            );
            System.out.println(
                    "  1,3,4,etc   -> Vários testes (ex. 1, 3 , 4) - Usa virgula"
            );
            System.out.println(
                    "  0           -> Sair"
            );
            System.out.println();
            System.out.print(
                    "Qual a Opção: "
            );

            String option =
                    scanner.nextLine().trim();

            /*
             * Sair.
             */
            if (option.equals("0")) {
                return List.of();
            }

            /*
             * Executar todos os testes.
             */
            if (option.isBlank()
                    || option.equalsIgnoreCase("t")
                    || option.equalsIgnoreCase("todos")) {

                return new ArrayList<>(
                        inputFiles
                );
            }

            /*
             * Executar um ou vários testes indicados por número.
             */
            try {
                return parseSelectedTests(
                        option,
                        inputFiles
                );

            } catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println(
                        "Seleção inválida: "
                                + e.getMessage()
                );
            }
        }
    }

    /*
     * Converte uma opção como "1,3,4" numa lista de ficheiros.
     */
    private static List<Path> parseSelectedTests(
            String option,
            List<Path> inputFiles
    ) {
        List<Path> selectedTests =
                new ArrayList<>();

        String[] values =
                option.split(",");

        for (String value : values) {
            int testNumber;

            try {
                testNumber =
                        Integer.parseInt(
                                value.trim()
                        );

            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(
                        "\"" + value
                                + "\" não é um número válido."
                );
            }

            if (testNumber < 1
                    || testNumber > inputFiles.size()) {

                throw new IllegalArgumentException(
                        "O teste "
                                + testNumber
                                + " não existe."
                );
            }

            Path selectedTest =
                    inputFiles.get(
                            testNumber - 1
                    );

            /*
             * Evita executar o mesmo teste duas vezes quando,
             * por exemplo, é introduzido "1,2,1".
             */
            if (!selectedTests.contains(
                    selectedTest
            )) {
                selectedTests.add(
                        selectedTest
                );
            }
        }

        return selectedTests;
    }

    /*
     * Executa os testes escolhidos e apresenta o resumo.
     */
    private static void executeSelectedTests(
            List<Path> selectedTests
    ) throws Exception {

        int successfulTests = 0;

        System.out.println();

        for (Path inputFile : selectedTests) {
            TestResult result =
                    executeTest(
                            inputFile
                    );

            printResult(
                    result
            );

            if (result.success()) {
                successfulTests++;
            }
        }

        int failedTests =
                selectedTests.size()
                        - successfulTests;

        System.out.println();
        System.out.println(
                "=========================================="
        );

        System.out.printf(
                "Resultado: %d teste(s) correto(s); "
                        + "%d teste(s) com erro.%n",
                successfulTests,
                failedTests
        );

        System.out.println(
                "=========================================="
        );
    }

    /*
     * Executa um teste individual num novo processo Java.
     */
    private static TestResult executeTest(
            Path inputFile
    ) throws Exception {

        String testName =
                removeExtension(
                        inputFile
                                .getFileName()
                                .toString()
                );

        Path expectedOutput =
                EXPECTED_OUTPUT_DIR.resolve(
                        testName + ".out"
                );

        Path generatedOutput =
                GENERATED_OUTPUT_DIR.resolve(
                        testName + ".myout"
                );

        Path importFile =
                INPUT_DIR.resolve(
                        testName + ".import"
                );

        Path errorFile =
                ERROR_DIR.resolve(
                        testName + ".err"
                );

        Path standardOutputFile =
                ERROR_DIR.resolve(
                        testName + ".stdout"
                );

        Files.deleteIfExists(
                generatedOutput
        );

        Files.deleteIfExists(
                errorFile
        );

        Files.deleteIfExists(
                standardOutputFile
        );

        if (!Files.exists(
                expectedOutput
        )) {
            return TestResult.failure(
                    testName,
                    "Não existe o ficheiro esperado: "
                            + expectedOutput
            );
        }

        List<String> command =
                new ArrayList<>();

        command.add(
                javaExecutable()
        );

        command.add(
                "-Din="
                        + inputFile
                        .toAbsolutePath()
        );

        command.add(
                "-Dout="
                        + generatedOutput
                        .toAbsolutePath()
        );

        /*
         * O ficheiro .import é opcional.
         */
        if (Files.exists(
                importFile
        )) {
            command.add(
                    "-Dimport="
                            + importFile
                            .toAbsolutePath()
            );
        }

        command.add(
                "-cp"
        );

        command.add(
                absoluteClasspath()
        );

        command.add(
                APP_MAIN_CLASS
        );

        ProcessBuilder processBuilder =
                new ProcessBuilder(
                        command
                );

        /*
         * O output normal da aplicação deve ser escrito no .myout
         * através da propriedade -Dout.
         *
         * Um stack trace ou uma escrita direta para System.out
         * fica guardado separadamente para diagnóstico.
         */
        processBuilder.redirectError(
                errorFile.toFile()
        );

        processBuilder.redirectOutput(
                standardOutputFile.toFile()
        );

        Process process =
                processBuilder.start();

        boolean finished =
                process.waitFor(
                        TIMEOUT.toMillis(),
                        TimeUnit.MILLISECONDS
                );

        /*
         * Proteção contra ciclos infinitos.
         */
        if (!finished) {
            process.destroyForcibly();
            process.waitFor();

            return TestResult.failure(
                    testName,
                    "Tempo limite excedido após "
                            + TIMEOUT.toSeconds()
                            + " segundos. "
                            + "Possível ciclo infinito."
            );
        }

        /*
         * Proteção contra exceções não tratadas.
         */
        if (process.exitValue() != 0) {
            return TestResult.failure(
                    testName,
                    "A aplicação terminou inesperadamente."
                            + readDiagnosticFile(
                            errorFile
                    )
            );
        }

        /*
         * Deteta escritas realizadas diretamente para System.out.
         *
         * A aplicação deve utilizar Dialogo.escreve() ou
         * Dialogo.escreveLinha().
         */
        if (hasContent(
                standardOutputFile
        )) {
            return TestResult.failure(
                    testName,
                    "Foi detetado output escrito diretamente "
                            + "para System.out."
                            + readDiagnosticFile(
                            standardOutputFile
                    )
            );
        }

        if (!Files.exists(
                generatedOutput
        )) {
            return TestResult.failure(
                    testName,
                    "A aplicação não gerou o ficheiro "
                            + generatedOutput
            );
        }

        Difference difference =
                compareFiles(
                        expectedOutput,
                        generatedOutput
                );

        if (difference == null) {
            return TestResult.success(
                    testName
            );
        }

        return TestResult.failure(
                testName,
                """
                O output obtido é diferente do esperado.
                Primeira diferença na linha %d.
                Esperado: %s
                Obtido:   %s
                """.formatted(
                        difference.lineNumber(),
                        visibleText(
                                difference.expected()
                        ),
                        visibleText(
                                difference.actual()
                        )
                )
        );
    }

    /*
     * Compara os ficheiros sem recorrer aos comandos diff, fc ou cmp.
     *
     * Deste modo, funciona em Windows, macOS e Linux.
     *
     * As diferenças entre \n e \r\n são ignoradas.
     * Os espaços continuam a ser comparados rigorosamente.
     */
    private static Difference compareFiles(
            Path expectedFile,
            Path generatedFile
    ) throws IOException {

        String expected =
                normalizeLineEndings(
                        Files.readString(
                                expectedFile,
                                StandardCharsets.UTF_8
                        )
                );

        String generated =
                normalizeLineEndings(
                        Files.readString(
                                generatedFile,
                                StandardCharsets.UTF_8
                        )
                );

        if (expected.equals(
                generated
        )) {
            return null;
        }

        String[] expectedLines =
                expected.split(
                        "\n",
                        -1
                );

        String[] generatedLines =
                generated.split(
                        "\n",
                        -1
                );

        int maximumLines =
                Math.max(
                        expectedLines.length,
                        generatedLines.length
                );

        for (int index = 0;
             index < maximumLines;
             index++) {

            String expectedLine =
                    index < expectedLines.length
                            ? expectedLines[index]
                            : "<FIM DO FICHEIRO>";

            String generatedLine =
                    index < generatedLines.length
                            ? generatedLines[index]
                            : "<FIM DO FICHEIRO>";

            if (!expectedLine.equals(
                    generatedLine
            )) {
                return new Difference(
                        index + 1,
                        expectedLine,
                        generatedLine
                );
            }
        }

        return null;
    }

    /*
     * Procura todos os ficheiros .in.
     */
    private static List<Path> findInputFiles()
            throws IOException {

        if (!Files.exists(
                INPUT_DIR
        )) {
            throw new IllegalStateException(
                    "A pasta de inputs não existe: "
                            + INPUT_DIR.toAbsolutePath()
                            + System.lineSeparator()
                            + "Confirma que a Working directory "
                            + "é $PROJECT_DIR$/app."
            );
        }

        try (Stream<Path> files =
                     Files.list(
                             INPUT_DIR
                     )) {

            return files
                    .filter(
                            Files::isRegularFile
                    )
                    .filter(
                            path -> path
                                    .getFileName()
                                    .toString()
                                    .endsWith(
                                            ".in"
                                    )
                    )
                    .sorted(
                            Comparator.comparing(
                                    path -> path
                                            .getFileName()
                                            .toString()
                            )
                    )
                    .toList();
        }
    }

    /*
     * Cria as pastas necessárias.
     */
    private static void ensureDirectories()
            throws IOException {

        Files.createDirectories(
                INPUT_DIR
        );

        Files.createDirectories(
                EXPECTED_OUTPUT_DIR
        );

        Files.createDirectories(
                GENERATED_OUTPUT_DIR
        );

        Files.createDirectories(
                ERROR_DIR
        );
    }

    /*
     * Limpa todos os resultados gerados anteriormente.
     */
    private static void cleanGeneratedResults()
            throws IOException {

        cleanDirectory(
                GENERATED_OUTPUT_DIR
        );

        /*
         * A pasta errors está dentro da pasta myout.
         * Após a limpeza é necessário recriá-la.
         */
        Files.createDirectories(
                ERROR_DIR
        );
    }

    /*
     * Apaga todo o conteúdo de uma pasta, mas preserva a própria pasta.
     */
    private static void cleanDirectory(
            Path directory
    ) throws IOException {

        if (!Files.exists(
                directory
        )) {
            return;
        }

        try (Stream<Path> paths =
                     Files.walk(
                             directory
                     )) {

            paths
                    .sorted(
                            Comparator.reverseOrder()
                    )
                    .filter(
                            path -> !path.equals(
                                    directory
                            )
                    )
                    .forEach(
                            path -> {
                                try {
                                    Files.deleteIfExists(
                                            path
                                    );

                                } catch (IOException e) {
                                    throw new RuntimeException(
                                            "Não foi possível apagar: "
                                                    + path,
                                            e
                                    );
                                }
                            }
                    );
        }
    }

    /*
     * Obtém o executável Java adequado ao sistema operativo.
     */
    private static String javaExecutable() {
        boolean windows =
                System.getProperty(
                                "os.name"
                        )
                        .toLowerCase()
                        .contains(
                                "win"
                        );

        String filename =
                windows
                        ? "java.exe"
                        : "java";

        return Path.of(
                System.getProperty(
                        "java.home"
                ),
                "bin",
                filename
        ).toString();
    }

    /*
     * Converte o classpath em caminhos absolutos.
     *
     * É importante porque é criado um novo processo Java
     * para cada teste.
     */
    private static String absoluteClasspath() {
        String separator =
                System.getProperty(
                        "path.separator"
                );

        return Arrays.stream(
                        System.getProperty(
                                        "java.class.path"
                                )
                                .split(
                                        Pattern.quote(
                                                separator
                                        )
                                )
                )
                .map(
                        path -> Path.of(
                                        path
                                )
                                .toAbsolutePath()
                                .normalize()
                                .toString()
                )
                .collect(
                        Collectors.joining(
                                separator
                        )
                );
    }

    /*
     * Normaliza os finais de linha para permitir executar
     * os testes em diferentes sistemas operativos.
     */
    private static String normalizeLineEndings(
            String text
    ) {
        return text
                .replace(
                        "\r\n",
                        "\n"
                )
                .replace(
                        "\r",
                        "\n"
                );
    }

    private static String removeExtension(
            String filename
    ) {
        int index =
                filename.lastIndexOf(
                        '.'
                );

        return index < 0
                ? filename
                : filename.substring(
                0,
                index
        );
    }

    /*
     * Mostra espaços como · para facilitar a deteção
     * de diferenças difíceis de visualizar.
     */
    private static String visibleText(
            String text
    ) {
        return "\""
                + text
                .replace(
                        "\t",
                        "\\t"
                )
                .replace(
                        " ",
                        "·"
                )
                + "\"";
    }

    private static boolean hasContent(
            Path file
    ) throws IOException {

        return Files.exists(
                file
        ) && Files.size(
                file
        ) > 0;
    }

    private static String readDiagnosticFile(
            Path file
    ) throws IOException {

        if (!hasContent(
                file
        )) {
            return "";
        }

        return System.lineSeparator()
                + Files.readString(
                file,
                StandardCharsets.UTF_8
        );
    }

    /*
     * Apresenta o resultado de um teste individual.
     */
    private static void printResult(
            TestResult result
    ) {
        if (result.success()) {
            System.out.println(
                    "[OK]   "
                            + result.testName()
            );

            return;
        }

        System.out.println(
                "[ERRO] "
                        + result.testName()
        );

        System.out.println(
                result.message()
                        .lines()
                        .map(
                                line -> "       "
                                        + line
                        )
                        .collect(
                                Collectors.joining(
                                        System.lineSeparator()
                                )
                        )
        );
    }

    private record Difference(
            int lineNumber,
            String expected,
            String actual
    ) {
    }

    private record TestResult(
            String testName,
            boolean success,
            String message
    ) {
        private static TestResult success(
                String testName
        ) {
            return new TestResult(
                    testName,
                    true,
                    ""
            );
        }

        private static TestResult failure(
                String testName,
                String message
        ) {
            return new TestResult(
                    testName,
                    false,
                    message
            );
        }
    }
}