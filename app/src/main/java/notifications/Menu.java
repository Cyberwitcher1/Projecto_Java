package atec.poo.loja.app.notifications;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;

/**
 * Menu de gestão de notificações e subscrições.
 */
public class Menu extends atec.poo.ui.Menu {

    /**
     * Cria o menu de gestão de notificações.
     *
     * @param storeManager gestor da loja utilizado pelos comandos
     */
    public Menu(
            StoreManager storeManager
    ) {
        super(
                Label.TITLE,
                new Comando<?>[]{
                        new DoReadClientNotifications(
                                storeManager
                        ),
                        new DoListNotificationHistory(
                                storeManager
                        ),
                        new DoListActiveSubscriptions(
                                storeManager
                        )
                }
        );
    }
}