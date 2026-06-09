package atec.poo.escola.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando não existe um aluno
 * com o identificador indicado.
 */
public class AppStudentNotFoundException extends DialogException {

    private final int studentId;

    public AppStudentNotFoundException(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.STUDENT_NOT_FOUND,
                this.studentId
        );
    }
}