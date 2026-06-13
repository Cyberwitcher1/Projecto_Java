package atec.poo.loja.app.main;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por apresentar um resumo geral da loja.
 */
public class DoShowStoreSummary
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por apresentar o resumo geral da loja.
     *
     * @param storeManager gestor da loja
     */
    public DoShowStoreSummary(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.SHOW_STORE_SUMMARY
        );
    }

    /**
     * Apresenta o resumo geral da loja.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        // TODO: A completar pelos alunos

    }
}