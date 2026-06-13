package atec.poo.loja.app.main;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por apresentar informação estatística
 * detalhada sobre a loja.
 */
public class DoShowStoreAdvancedDetails
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por apresentar
     * os detalhes avançados da loja.
     *
     * @param storeManager gestor da loja
     */
    public DoShowStoreAdvancedDetails(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.SHOW_STORE_ADVANCED_DETAILS
        );
    }

    /**
     * Apresenta os detalhes avançados da loja.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        // TODO: A completar pelos alunos

    }
}