package atec.poo.loja.app.products;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.util.List;

/**
 * Comando responsável por pesquisar produtos pelo nome.
 */
public class DoSearchProducts
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por pesquisar produtos.
     *
     * @param storeManager gestor da loja
     */
    public DoSearchProducts(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.SEARCH_PRODUCTS
        );
    }

    /**
     * Pesquisa produtos pelo nome.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos

    }
}