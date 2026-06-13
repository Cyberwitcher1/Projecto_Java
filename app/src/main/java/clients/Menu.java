package atec.poo.loja.app.clients;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;

/**
 * Menu de gestão de clientes.
 *
 * <p>Este menu disponibiliza as operações relacionadas com o registo,
 * consulta, listagem, alteração e pesquisa de clientes.</p>
 */
public class Menu extends atec.poo.ui.Menu {

    /**
     * Cria o menu de gestão de clientes.
     *
     * @param storeManager gestor da loja utilizado pelos comandos
     */
    public Menu(StoreManager storeManager) {
        super(
                Label.TITLE,
                new Comando<?>[]{
                        new DoRegisterClient(storeManager),
                        new DoShowClient(storeManager),
                        new DoListClients(storeManager),
                        new DoListClientsByAge(storeManager),
                        new DoChangeClientName(storeManager),
                        new DoSearchClients(storeManager)
                }
        );
    }
}