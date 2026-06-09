package atec.poo.escola.app.turmas;

import atec.poo.ui.Dialogo;
import atec.poo.ui.LerInteiro;
import atec.poo.ui.LerString;
import atec.poo.ui.exceptions.DialogException;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por solicitar ao utilizador os dados
 * necessários às operações relacionadas com turmas.
 *
 * Esta classe não deve ser instanciada.
 */
public final class Prompt {

    /**
     * Instância comum utilizada para ler os inputs da aplicação.
     */
    public static final Dialogo ui = IO;

    /**
     * Impede a criação de instâncias desta classe.
     */
    private Prompt() {
    }

    /**
     * Solicita o código de uma turma.
     *
     * @return código introduzido pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static String classCode() throws DialogException {
        LerString input = new LerString(
                Label.ASK_CLASS_CODE,
                null
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o identificador de um professor.
     *
     * @return identificador introduzido pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int professorId() throws DialogException {
        LerInteiro input = new LerInteiro(
                Label.ASK_PROFESSOR_ID
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o identificador de um aluno.
     *
     * @return identificador introduzido pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int studentId() throws DialogException {
        LerInteiro input = new LerInteiro(
                Label.ASK_STUDENT_ID
        );

        ui.lerInput(input);

        return input.getValor();
    }
}