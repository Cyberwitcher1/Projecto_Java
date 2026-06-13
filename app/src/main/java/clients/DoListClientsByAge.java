package atec.poo.loja.app.clients;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.util.List;

/**
 * Comando responsável por listar os clientes registados por idade.
 */
public class DoListClientsByAge extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por listar os clientes por idade.
     *
     * @param storeManager gestor da loja
     */
    public DoListClientsByAge(StoreManager storeManager) {
        super(storeManager, Label.LIST_CLIENTS_BY_AGE);
    }

    /**
     * Apresenta a lista de clientes ordenada por idade.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar() throws DialogException {
       //TODO: A implementar pelos alunos
    }
}