package atec.poo.loja.app.products;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.util.List;

/**
 * Comando responsável por listar os produtos registados.
 */
public class DoListProducts
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por listar os produtos.
     *
     * @param storeManager gestor da loja
     */
    public DoListProducts(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.LIST_PRODUCTS
        );
    }

    /**
     * Apresenta a lista de produtos registados.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos

    }
}