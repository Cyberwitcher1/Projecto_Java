package atec.poo.escola.app.turmas;

import atec.poo.ui.Dialogo;

import java.util.ArrayList;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por apresentar as mensagens associadas
 * às operações relacionadas com turmas.
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
     * Apresenta uma mensagem de sucesso após a criação de uma turma.
     *
     * @param classCode código da turma criada
     */
    public static void classCreated(String classCode) {
        ui.escreveLinha(
                String.format(
                        Label.CLASS_CREATED_SUCCESS,
                        classCode
                )
        );
    }

    /**
     * Apresenta uma mensagem de sucesso após a associação de um aluno
     * a uma turma.
     *
     * @param studentId identificador do aluno
     * @param classCode código da turma
     */
    public static void studentAddedToClass(
            int studentId,
            String classCode
    ) {
        ui.escreveLinha(
                String.format(
                        Label.STUDENT_ADDED_TO_CLASS_SUCCESS,
                        studentId,
                        classCode
                )
        );
    }

    /**
     * Apresenta a lista de turmas.
     *
     * @param classes turmas a apresentar
     */
    public static void classes(ArrayList<String> classes) {
        ui.escreveLinha(
                String.format(
                        Label.LIST_CLASSES_TITLE,
                        classes.size()
                )
        );

        for (String schoolClass : classes) {
            ui.escreveLinha("-> " + schoolClass);
        }
    }

    /**
     * Apresenta a ficha completa de uma turma.
     *
     * @param classCode    código da turma
     * @param classDetails dados formatados da turma
     */
    public static void classDetails(
            String classCode,
            String classDetails
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLASS_DETAILS_TITLE,
                        classCode
                )
        );

        ui.escreveLinha(classDetails);
        ui.escreveLinha(Label.CLASS_DETAILS_FOOTER);
    }
}