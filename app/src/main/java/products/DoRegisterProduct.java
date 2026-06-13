package atec.poo.loja.app.products;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por registar um novo produto.
 */
public class DoRegisterProduct
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por registar um produto.
     *
     * @param storeManager gestor da loja
     */
    public DoRegisterProduct(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.REGISTER_PRODUCT
        );
    }

    /**
     * Regista um novo produto.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos

    }
}