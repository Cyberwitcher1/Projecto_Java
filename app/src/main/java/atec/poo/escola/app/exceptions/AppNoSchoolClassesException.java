package atec.poo.escola.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando se tenta listar turmas,
 * mas ainda não existem turmas registadas.
 */
public class AppNoSchoolClassesException extends DialogException {

    @Override
    public String getMessage() {
        return Label.NO_SCHOOL_CLASSES;
    }
}