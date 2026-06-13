package atec.poo.loja.app.clients;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.util.List;

/**
 * Comando responsável por listar os clientes registados.
 */
public class DoListClients extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por listar os clientes.
     *
     * @param storeManager gestor da loja
     */
    public DoListClients(StoreManager storeManager) {
        super(storeManager, Label.LIST_CLIENTS);
    }

    /**
     * Apresenta a lista de clientes registados.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A fazer pelos alunos

    }
}