package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando um produto não pode
 * ser vendido na data atual.
 */
public class AppProductCannotBeSoldException
        extends DialogException {

    private final int productId;

    public AppProductCannotBeSoldException(
            int productId
    ) {
        this.productId = productId;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.PRODUCT_CANNOT_BE_SOLD,
                this.productId
        );
    }
}