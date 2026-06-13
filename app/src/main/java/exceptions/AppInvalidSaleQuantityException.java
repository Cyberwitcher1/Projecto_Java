package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando a quantidade indicada
 * para uma venda não é válida.
 */
public class AppInvalidSaleQuantityException
        extends DialogException {

    private final int quantity;

    public AppInvalidSaleQuantityException(
            int quantity
    ) {
        this.quantity = quantity;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.INVALID_SALE_QUANTITY,
                this.quantity
        );
    }
}