package atec.poo.escola.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando já existe um professor
 * com o número indicado.
 */
public class AppProfessorAlreadyExistsException extends DialogException {

    private final int professorNumber;

    public AppProfessorAlreadyExistsException(int professorNumber) {
        this.professorNumber = professorNumber;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.PROFESSOR_ALREADY_EXISTS,
                this.professorNumber
        );
    }
}