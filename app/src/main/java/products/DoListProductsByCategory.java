package atec.poo.loja.app.products;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.util.List;

/**
 * Comando responsável por listar os produtos
 * pertencentes a uma categoria.
 */
public class DoListProductsByCategory
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por listar produtos por categoria.
     *
     * @param storeManager gestor da loja
     */
    public DoListProductsByCategory(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.LIST_PRODUCTS_BY_CATEGORY
        );
    }

    /**
     * Apresenta os produtos pertencentes a uma categoria.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos

    }
}