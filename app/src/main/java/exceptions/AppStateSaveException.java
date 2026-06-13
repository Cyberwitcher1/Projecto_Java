package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não é possível guardar
 * o estado da aplicação.
 */
public class AppStateSaveException
        extends DialogException {

    private final String filename;

    public AppStateSaveException(
            String filename
    ) {
        this.filename = filename;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.STATE_SAVE_ERROR,
                this.filename
        );
    }
}