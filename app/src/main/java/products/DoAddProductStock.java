package atec.poo.loja.app.products;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por adicionar unidades ao stock
 * atual de um produto.
 */
public class DoAddProductStock
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por adicionar stock a um produto.
     *
     * @param storeManager gestor da loja
     */
    public DoAddProductStock(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.ADD_PRODUCT_STOCK
        );
    }

    /**
     * Acrescenta unidades ao stock atual de um produto.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos

    }
}