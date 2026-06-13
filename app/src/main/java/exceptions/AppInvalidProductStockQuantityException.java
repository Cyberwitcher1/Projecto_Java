package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando a quantidade a adicionar
 * ao stock não é válida.
 */
public class AppInvalidProductStockQuantityException
        extends DialogException {

    private final int quantity;

    public AppInvalidProductStockQuantityException(
            int quantity
    ) {
        this.quantity = quantity;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.INVALID_PRODUCT_STOCK_QUANTITY,
                this.quantity
        );
    }
}