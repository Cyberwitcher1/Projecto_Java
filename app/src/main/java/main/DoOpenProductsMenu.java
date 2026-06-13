package atec.poo.loja.app.main;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por abrir o menu de gestão de produtos.
 *
 * <p>O menu de produtos disponibiliza as operações relacionadas com o
 * registo, consulta, listagem, pesquisa, alteração de preço, alteração
 * de stock e consulta do histórico de preços.</p>
 */
public class DoOpenProductsMenu extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por abrir o menu de produtos.
     *
     * @param storeManager gestor da loja que será partilhado com o submenu
     */
    public DoOpenProductsMenu(StoreManager storeManager) {
        super(storeManager, Label.OPEN_PRODUCTS_MENU);
    }

    /**
     * Abre o menu de gestão de produtos.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        new atec.poo.loja.app.products.Menu(
                this.getReceptor()
        ).open();
    }
}