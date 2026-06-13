package atec.poo.loja.app.products;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por apresentar os detalhes de um produto.
 */
public class DoShowProduct
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por apresentar um produto.
     *
     * @param storeManager gestor da loja
     */
    public DoShowProduct(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.SHOW_PRODUCT
        );
    }

    /**
     * Apresenta os detalhes de um produto.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos

    }
}