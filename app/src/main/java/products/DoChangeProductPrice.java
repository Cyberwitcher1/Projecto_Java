package atec.poo.loja.app.products;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por alterar o preço de um produto.
 */
public class DoChangeProductPrice
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por alterar o preço de um produto.
     *
     * @param storeManager gestor da loja
     */
    public DoChangeProductPrice(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.CHANGE_PRODUCT_PRICE
        );
    }

    /**
     * Altera o preço de um produto.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos
    }
}