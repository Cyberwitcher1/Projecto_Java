package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não existem vendas registadas.
 */
public class AppNoSalesRegisteredException
        extends DialogException {

    @Override
    public String getMessage() {
        return Label.NO_SALES_REGISTERED;
    }
}