package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando o stock inicial
 * de um produto não é válido.
 */
public class AppInvalidProductStockException
        extends DialogException {

    private final int stock;

    public AppInvalidProductStockException(
            int stock
    ) {
        this.stock = stock;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.INVALID_PRODUCT_STOCK,
                this.stock
        );
    }
}