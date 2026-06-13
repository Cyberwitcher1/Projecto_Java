package atec.poo.loja.app.main;

import atec.poo.ui.Dialogo;
import atec.poo.ui.LerInteiro;
import atec.poo.ui.LerString;
import atec.poo.ui.exceptions.DialogException;

import java.time.LocalDate;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por solicitar ao utilizador os valores
 * necessários às operações disponíveis no menu principal.
 */
public final class Prompt {

    /**
     * Instância comum de diálogo utilizada para ler os inputs da aplicação.
     */
    public static final Dialogo ui = IO;

    /**
     * Impede a criação de instâncias desta classe utilitária.
     */
    private Prompt() {
    }

    /**
     * Solicita ao utilizador o número de dias que pretende avançar na data
     * simulada da aplicação.
     *
     * <p>Este método apresenta a data atual da loja e garante apenas que
     * o valor introduzido é um número inteiro. A validação da regra de
     * negócio, nomeadamente se o valor é superior a zero, é realizada
     * no {@code core}.</p>
     *
     * @param today data simulada atual da aplicação
     * @return número de dias introduzido pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura do input
     */
    public static int numberOfDays(LocalDate today)
            throws DialogException {

        LerInteiro input = new LerInteiro(
                Label.ASK_NUMBER_OF_DAYS
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita ao utilizador o nome do ficheiro onde pretende guardar
     * o estado atual da aplicação.
     *
     * @return nome do ficheiro introduzido pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura do input
     */
    public static String saveFilename() throws DialogException {
        LerString input = new LerString(
                Label.ASK_SAVE_FILENAME,
                null
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita ao utilizador o nome do ficheiro a partir do qual pretende
     * carregar o estado da aplicação.
     *
     * @return nome do ficheiro introduzido pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura do input
     */
    public static String loadFilename() throws DialogException {
        LerString input = new LerString(
                Label.ASK_LOAD_FILENAME,
                null
        );

        ui.lerInput(input);

        return input.getValor();
    }
}