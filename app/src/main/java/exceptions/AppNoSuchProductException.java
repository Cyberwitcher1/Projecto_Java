package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não existe um produto
 * com o identificador indicado.
 */
public class AppNoSuchProductException
        extends DialogException {

    private final int productId;

    public AppNoSuchProductException(
            int productId
    ) {
        this.productId =
                productId;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.NO_SUCH_PRODUCT,
                this.productId
        );
    }
}