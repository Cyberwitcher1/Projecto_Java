package atec.poo.escola.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando já existe uma turma
 * com o código indicado.
 */
public class AppSchoolClassAlreadyExistsException extends DialogException {

    private final String classCode;

    public AppSchoolClassAlreadyExistsException(String classCode) {
        this.classCode = classCode;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.SCHOOL_CLASS_ALREADY_EXISTS,
                this.classCode
        );
    }
}