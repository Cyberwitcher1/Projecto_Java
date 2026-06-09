package atec.poo.escola.app.main;

import atec.poo.ui.Dialogo;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe responsável pelas mensagens apresentadas pelo menu principal.
 */
public final class Message {

    public static final Dialogo ui = IO;

    private Message() {
    }

    /**
     * Apresenta o resumo geral da escola.
     *
     * @param numberOfStudents número de alunos registados
     * @param numberOfTeachers número de professores registados
     * @param numberOfClasses  número de turmas existentes
     */
    public static void schoolSummary(
            int numberOfStudents,
            int numberOfTeachers,
            int numberOfClasses
    ) {
        ui.escreveLinha(
                String.format(
                        Label.SCHOOL_SUMMARY,
                        numberOfStudents,
                        numberOfTeachers,
                        numberOfClasses
                )
        );
    }
}