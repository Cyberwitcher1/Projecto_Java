package atec.poo.loja.app.main;

import atec.poo.loja.app.clients.Menu;
import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por abrir o menu de gestão de clientes.
 *
 * <p>O menu de clientes disponibiliza as operações relacionadas com o
 * registo, consulta, listagem, alteração e pesquisa de clientes.</p>
 */
public class DoOpenClientsMenu extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por abrir o menu de clientes.
     *
     * @param storeManager gestor da loja que será partilhado com o submenu
     */
    public DoOpenClientsMenu(StoreManager storeManager) {
        super(storeManager, Label.OPEN_CLIENTS_MENU);
    }

    /**
     * Abre o menu de gestão de clientes.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        //Cria e abre o menu de clientes.
        new Menu(this.getReceptor()).open();
    }
}