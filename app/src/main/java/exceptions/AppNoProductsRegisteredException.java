package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não existem produtos registados.
 */
public class AppNoProductsRegisteredException
        extends DialogException {

    @Override
    public String getMessage() {
        return Label.NO_PRODUCTS_REGISTERED;
    }
}