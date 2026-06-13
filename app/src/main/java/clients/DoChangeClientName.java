package atec.poo.loja.app.clients;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por alterar o nome de um cliente.
 */
public class DoChangeClientName extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por alterar o nome de um cliente.
     *
     * @param storeManager gestor da loja
     */
    public DoChangeClientName(StoreManager storeManager) {
        super(storeManager, Label.CHANGE_CLIENT_NAME);
    }

    /**
     * Altera o nome de um cliente.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A fazer pelos alunos
    }
}