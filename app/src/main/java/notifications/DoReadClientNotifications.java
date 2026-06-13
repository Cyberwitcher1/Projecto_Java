package atec.poo.loja.app.notifications;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.util.List;

/**
 * Comando responsável por apresentar as notificações
 * ainda não lidas de um cliente.
 */
public class DoReadClientNotifications
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por consultar notificações.
     *
     * @param storeManager gestor da loja
     */
    public DoReadClientNotifications(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.READ_CLIENT_NOTIFICATIONS
        );
    }

    /**
     * Apresenta as notificações ainda não lidas
     * e permite cancelar as subscrições do cliente.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        // TODO: A fazer pelos alunos

    }
}