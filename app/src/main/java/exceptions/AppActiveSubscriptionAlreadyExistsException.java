package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando já existe uma subscrição ativa
 * para o mesmo cliente e produto.
 */
public class AppActiveSubscriptionAlreadyExistsException
        extends DialogException {

    private final int clientId;
    private final int productId;

    public AppActiveSubscriptionAlreadyExistsException(
            int clientId,
            int productId
    ) {
        this.clientId = clientId;
        this.productId = productId;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.ACTIVE_SUBSCRIPTION_ALREADY_EXISTS,
                this.clientId,
                this.productId
        );
    }
}