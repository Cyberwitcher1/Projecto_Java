package atec.poo.loja.app.main;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por abrir o menu de vendas.
 *
 * <p>O menu de vendas disponibiliza as operações relacionadas com a compra
 * de produtos e a consulta das vendas registadas.</p>
 */
public class DoOpenSalesMenu extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por abrir o menu de vendas.
     *
     * @param storeManager gestor da loja que será partilhado com o submenu
     */
    public DoOpenSalesMenu(StoreManager storeManager) {
        super(storeManager, Label.OPEN_SALES_MENU);
    }

    /**
     * Abre o menu de vendas.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        new atec.poo.loja.app.sales.Menu(
                this.getReceptor()
        ).open();
    }
}