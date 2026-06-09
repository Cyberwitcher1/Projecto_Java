package atec.poo.escola.app.professores;

import atec.poo.ui.Dialogo;
import atec.poo.ui.LerData;
import atec.poo.ui.LerInteiro;
import atec.poo.ui.LerString;
import atec.poo.ui.exceptions.DialogException;

import java.time.LocalDate;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por solicitar ao utilizador os dados
 * necessários às operações relacionadas com professores.
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
     * Solicita o número de um professor.
     *
     * @return número introduzido pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int professorNumber() throws DialogException {
        LerInteiro input = new LerInteiro(
                Label.ASK_PROFESSOR_NUMBER
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o nome de um professor.
     *
     * @return nome introduzido pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static String professorName() throws DialogException {
        LerString input = new LerString(
                Label.ASK_PROFESSOR_NAME,
                null
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita a data de nascimento de um professor.
     *
     * @return data introduzida pelo utilizador
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static LocalDate professorBirthDate() throws DialogException {
        LerData input = new LerData(
                Label.ASK_PROFESSOR_BIRTH_DATE
        );

        ui.lerInput(input);

        return input.getValor();
    }
}