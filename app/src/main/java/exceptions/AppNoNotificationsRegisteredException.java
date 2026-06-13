package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não existem notificações registadas.
 */
public class AppNoNotificationsRegisteredException
        extends DialogException {

    @Override
    public String getMessage() {
        return Label.NO_NOTIFICATIONS_REGISTERED;
    }
}