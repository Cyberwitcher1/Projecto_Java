package atec.poo.loja.app.sales;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por apresentar os detalhes de uma venda.
 */
public class DoShowSale
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por apresentar uma venda.
     *
     * @param storeManager gestor da loja
     */
    public DoShowSale(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.SHOW_SALE
        );
    }

    /**
     * Apresenta os detalhes de uma venda.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos

    }
}