package atec.poo.loja.app.products;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por aumentar os preços dos produtos
 * pertencentes a uma categoria.
 */
public class DoIncreaseCategoryPrices
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por aumentar os preços
     * dos produtos de uma categoria.
     *
     * @param storeManager gestor da loja
     */
    public DoIncreaseCategoryPrices(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.INCREASE_CATEGORY_PRICES
        );
    }

    /**
     * Aumenta os preços dos produtos de uma categoria.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos
    }
}