package atec.poo.loja.app.main;

import atec.poo.loja.app.notifications.Menu;
import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por abrir o menu de notificações.
 *
 * <p>O menu de notificações disponibiliza as operações relacionadas com
 * a consulta do histórico de notificações e a gestão das subscrições
 * associadas aos clientes.</p>
 */
public class DoOpenNotificationsMenu extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por abrir o menu de notificações.
     *
     * @param storeManager gestor da loja que será partilhado com o submenu
     */
    public DoOpenNotificationsMenu(StoreManager storeManager) {
        super(storeManager, Label.OPEN_NOTIFICATIONS_MENU);
    }

    /**
     * Abre o menu de notificações.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A completar pelos alunos
        new Menu(this.getReceptor()).open();


    }
}