package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando o preço de um produto
 * não é válido.
 */
public class AppInvalidProductPriceException
        extends DialogException {

    private final double price;

    public AppInvalidProductPriceException(
            double price
    ) {
        this.price = price;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.INVALID_PRODUCT_PRICE,
                this.price
        );
    }
}