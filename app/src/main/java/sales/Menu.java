package atec.poo.loja.app.sales;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;

/**
 * Menu de gestão de vendas.
 *
 * <p>Este menu disponibiliza as operações relacionadas com o registo
 * e consulta das vendas realizadas.</p>
 */
public class Menu extends atec.poo.ui.Menu {

    /**
     * Cria o menu de gestão de vendas.
     *
     * @param storeManager gestor da loja utilizado pelos comandos
     */
    public Menu(
            StoreManager storeManager
    ) {
        super(
                Label.TITLE,
                new Comando<?>[]{
                        new DoRegisterSale(
                                storeManager
                        ),
                        new DoShowSale(
                                storeManager
                        ),
                        new DoListSales(
                                storeManager
                        ),
                        new DoListClientSales(
                                storeManager
                        )
                }
        );
    }
}