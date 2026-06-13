package atec.poo.loja.app.products;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;

/**
 * Menu de gestão de produtos.
 *
 * <p>Este menu disponibiliza as operações relacionadas com o registo,
 * consulta, listagem, pesquisa, alteração de preços, gestão de stock
 * e consulta do histórico de preços.</p>
 */
public class Menu extends atec.poo.ui.Menu {

    /**
     * Cria o menu de gestão de produtos.
     *
     * @param storeManager gestor da loja utilizado pelos comandos
     */
    public Menu(StoreManager storeManager) {
        super(
                Label.TITLE,
                new Comando<?>[]{
                        new DoRegisterProduct(storeManager),
                        new DoShowProduct(storeManager),
                        new DoListProducts(storeManager),
                        new DoListProductsByCategory(storeManager),
                        new DoSearchProducts(storeManager),
                        new DoChangeProductPrice(storeManager),
                        new DoIncreaseCategoryPrices(storeManager),
                        new DoAddProductStock(storeManager),
                        new DoShowProductPriceHistory(storeManager)
                }
        );
    }
}