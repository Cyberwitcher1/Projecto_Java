package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não existe stock suficiente
 * para concluir uma venda.
 */
public class AppInsufficientProductStockException
        extends DialogException {

    private final int productId;
    private final int requestedQuantity;
    private final int availableStock;

    public AppInsufficientProductStockException(
            int productId,
            int requestedQuantity,
            int availableStock
    ) {
        this.productId = productId;
        this.requestedQuantity = requestedQuantity;
        this.availableStock = availableStock;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.INSUFFICIENT_PRODUCT_STOCK,
                this.productId,
                this.requestedQuantity,
                this.availableStock
        );
    }
}