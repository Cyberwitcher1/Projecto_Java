package atec.poo.loja.app.products;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.util.List;

/**
 * Comando responsável por apresentar o histórico
 * de preços de um produto.
 */
public class DoShowProductPriceHistory
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por apresentar
     * o histórico de preços.
     *
     * @param storeManager gestor da loja
     */
    public DoShowProductPriceHistory(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.SHOW_PRODUCT_PRICE_HISTORY
        );
    }

    /**
     * Apresenta o histórico de preços de um produto.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos

    }
}