package atec.poo.escola.app.professores;

import atec.poo.ui.Dialogo;

import java.util.ArrayList;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por apresentar as mensagens associadas
 * às operações relacionadas com professores.
 *
 * Esta classe não deve ser instanciada.
 */
public final class Message {

    /**
     * Instância comum utilizada para escrever os outputs da aplicação.
     */
    public static final Dialogo ui = IO;

    /**
     * Impede a criação de instâncias desta classe.
     */
    private Message() {
    }

    /**
     * Apresenta uma mensagem de sucesso após a criação de um professor.
     *
     * @param professorNumber número do professor criado
     */
    public static void professorCreated(int professorNumber) {
        ui.escreveLinha(
                String.format(
                        Label.PROFESSOR_CREATED_SUCCESS,
                        professorNumber
                )
        );
    }

    /**
     * Apresenta a lista de professores ordenada por idade.
     *
     * @param professors professores a apresentar
     */
    public static void professorsOrderedByAge(
            ArrayList<String> professors
    ) {
        ui.escreveLinha(
                String.format(
                        Label.LIST_PROFESSORS_BY_AGE_TITLE,
                        professors.size()
                )
        );

        for (String professor : professors) {
            ui.escreveLinha("-> " + professor);
        }
    }

    /**
     * Apresenta a lista de professores ordenada por nome.
     *
     * @param professors professores a apresentar
     */
    public static void professorsOrderedByName(
            ArrayList<String> professors
    ) {
        ui.escreveLinha(
                String.format(
                        Label.LIST_PROFESSORS_BY_NAME_TITLE,
                        professors.size()
                )
        );

        for (String professor : professors) {
            ui.escreveLinha("-> " + professor);
        }
    }

    /**
     * Apresenta a ficha completa de um professor.
     *
     * @param professorNumber  número do professor
     * @param professorDetails dados formatados do professor
     */
    public static void professorDetails(
            int professorNumber,
            String professorDetails
    ) {
        ui.escreveLinha(
                String.format(
                        Label.PROFESSOR_DETAILS_TITLE,
                        professorNumber
                )
        );

        ui.escreveLinha(professorDetails);
        ui.escreveLinha(Label.PROFESSOR_DETAILS_FOOTER);
    }
}