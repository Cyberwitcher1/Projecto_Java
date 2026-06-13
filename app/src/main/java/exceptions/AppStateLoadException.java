package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não é possível abrir
 * um estado anteriormente guardado.
 */
public class AppStateLoadException
        extends DialogException {

    private final String filename;

    public AppStateLoadException(
            String filename
    ) {
        this.filename = filename;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.STATE_LOAD_ERROR,
                this.filename
        );
    }
}