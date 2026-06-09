package atec.poo.escola.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando não existe uma turma
 * com o código indicado.
 */
public class AppSchoolClassNotFoundException extends DialogException {

    private final String classCode;

    public AppSchoolClassNotFoundException(String classCode) {
        this.classCode = classCode;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.SCHOOL_CLASS_NOT_FOUND,
                this.classCode
        );
    }
}