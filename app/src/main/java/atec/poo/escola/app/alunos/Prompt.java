package atec.poo.escola.app.alunos;

import atec.poo.ui.Dialogo;
import atec.poo.ui.LerData;
import atec.poo.ui.LerInteiro;
import atec.poo.ui.LerString;
import atec.poo.ui.exceptions.DialogException;

import java.time.LocalDate;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por solicitar ao utilizador os dados
 * necessários às operações relacionadas com alunos.
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
     * Solicita o número de um aluno.
     *
     * @return número introduzido pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int studentNumber() throws DialogException {
        LerInteiro input = new LerInteiro(
                Label.ASK_STUDENT_NUMBER
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o nome de um aluno.
     *
     * @return nome introduzido pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static String studentName() throws DialogException {
        LerString input = new LerString(
                Label.ASK_STUDENT_NAME,
                null
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita a data de nascimento de um aluno.
     *
     * @return data introduzida pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static LocalDate studentBirthDate() throws DialogException {
        LerData input = new LerData(
                Label.ASK_STUDENT_BIRTH_DATE
        );

        ui.lerInput(input);

        return input.getValor();
    }
}