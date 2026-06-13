package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não existem subscrições ativas.
 */
public class AppNoActiveSubscriptionsException
        extends DialogException {

    @Override
    public String getMessage() {
        return Label.NO_ACTIVE_SUBSCRIPTIONS;
    }
}