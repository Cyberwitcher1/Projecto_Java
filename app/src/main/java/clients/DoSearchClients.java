package atec.poo.loja.app.clients;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.util.List;

/**
 * Comando responsável por pesquisar clientes.
 */
public class DoSearchClients
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por pesquisar clientes.
     *
     * @param storeManager gestor da loja
     */
    public DoSearchClients(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.SEARCH_CLIENTS
        );
    }

    /**
     * Pesquisa clientes pelo nome, NIF ou status.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        // TODO: A fazer pelos alunos
    }
}