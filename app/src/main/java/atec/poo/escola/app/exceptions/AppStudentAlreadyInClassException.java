package atec.poo.escola.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando se tenta adicionar novamente
 * o mesmo aluno à mesma turma.
 */
public class AppStudentAlreadyInClassException extends DialogException {

    private final int studentId;
    private final String classCode;

    public AppStudentAlreadyInClassException(
            int studentId,
            String classCode
    ) {
        this.studentId = studentId;
        this.classCode = classCode;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.STUDENT_ALREADY_IN_CLASS,
                this.studentId,
                this.classCode
        );
    }
}