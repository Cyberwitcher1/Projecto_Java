package atec.poo.escola.app.alunos;

import atec.poo.ui.Dialogo;

import java.util.List;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por apresentar as mensagens associadas
 * às operações relacionadas com alunos.
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
     * Apresenta uma mensagem de sucesso após a criação de um aluno.
     *
     * @param studentNumber número do aluno criado
     */
    public static void studentCreated(int studentNumber) {
        ui.escreveLinha(
                String.format(
                        Label.STUDENT_CREATED_SUCCESS,
                        studentNumber
                )
        );
    }

    /**
     * Apresenta a lista de alunos ordenada por nome.
     *
     * @param students alunos a apresentar
     */
    public static void studentsOrderedByName(List<String> students) {
        ui.escreveLinha(
                String.format(
                        Label.LIST_STUDENTS_BY_NAME_TITLE,
                        students.size()
                )
        );

        for (String student : students) {
            ui.escreveLinha("-> " + student);
        }
    }

    /**
     * Apresenta a lista de alunos ordenada por idade.
     *
     * @param students alunos a apresentar
     */
    public static void studentsOrderedByAge(List<String> students) {
        ui.escreveLinha(
                String.format(
                        Label.LIST_STUDENTS_BY_AGE_TITLE,
                        students.size()
                )
        );

        for (String student : students) {
            ui.escreveLinha("-> " + student);
        }
    }

    /**
     * Apresenta a ficha completa de um aluno.
     *
     * @param studentNumber número do aluno
     * @param studentDetails dados formatados do aluno
     */
    public static void studentDetails(
            int studentNumber,
            String studentDetails
    ) {
        ui.escreveLinha(
                String.format(
                        Label.STUDENT_DETAILS_TITLE,
                        studentNumber
                )
        );

        ui.escreveLinha(studentDetails);
        ui.escreveLinha(Label.STUDENT_DETAILS_FOOTER);
    }
}