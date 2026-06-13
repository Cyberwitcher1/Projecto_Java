package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando um cliente ainda
 * não efetuou vendas.
 */
public class AppNoClientSalesException
        extends DialogException {

    private final int clientId;
    private final String clientName;

    public AppNoClientSalesException(
            int clientId,
            String clientName
    ) {
        this.clientId = clientId;
        this.clientName = clientName;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.NO_CLIENT_SALES,
                this.clientId,
                this.clientName
        );
    }
}