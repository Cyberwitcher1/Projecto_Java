package atec.poo.loja.app.clients;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por apresentar os detalhes de um cliente.
 */
public class DoShowClient extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por apresentar um cliente.
     *
     * @param storeManager gestor da loja
     */
    public DoShowClient(StoreManager storeManager) {
        super(storeManager, Label.SHOW_CLIENT);
    }

    /**
     * Apresenta os detalhes de um cliente.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A fazer pelos alunos

    }
}