package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não existe uma venda
 * com o identificador indicado.
 */
public class AppNoSuchSaleException
        extends DialogException {

    private final int saleId;

    public AppNoSuchSaleException(
            int saleId
    ) {
        this.saleId = saleId;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.NO_SUCH_SALE,
                this.saleId
        );
    }
}