package atec.poo.loja.app.notifications;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.util.List;

/**
 * Comando responsável por listar as subscrições ativas.
 */
public class DoListActiveSubscriptions
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por listar subscrições ativas.
     *
     * @param storeManager gestor da loja
     */
    public DoListActiveSubscriptions(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.LIST_ACTIVE_SUBSCRIPTIONS
        );
    }

    /**
     * Apresenta todas as subscrições ativas da loja.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        // TODO: A fazer pelos alunos

    }
}