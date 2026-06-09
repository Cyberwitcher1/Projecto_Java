package atec.poo.escola.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando não existe um professor
 * com o número indicado.
 */
public class AppProfessorNotFoundException extends DialogException {

    private final int professorNumber;

    public AppProfessorNotFoundException(int professorNumber) {
        this.professorNumber = professorNumber;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.PROFESSOR_NOT_FOUND,
                this.professorNumber
        );
    }
}