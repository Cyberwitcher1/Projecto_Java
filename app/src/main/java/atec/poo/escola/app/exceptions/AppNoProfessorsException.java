package atec.poo.escola.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando se tenta listar professores,
 * mas ainda não existem professores registados.
 */
public class AppNoProfessorsException extends DialogException {

    @Override
    public String getMessage() {
        return Label.NO_PROFESSORS;
    }
}