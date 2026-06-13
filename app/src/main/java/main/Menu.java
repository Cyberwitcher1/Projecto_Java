package atec.poo.loja.app.main;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;

/**
 * Menu principal da aplicação.
 *
 * <p>Este menu permite aceder aos diferentes submenus da loja e executar
 * operações globais, como avançar a data simulada, guardar o estado da
 * aplicação e abrir um estado anteriormente guardado.</p>
 *
 * <p>Cada opção apresentada ao utilizador corresponde a uma subclasse de
 * {@link Comando}. A classe apenas define a composição e a ordem das opções
 * do menu. A execução de cada funcionalidade é delegada no respetivo
 * comando.</p>
 */
public class Menu extends atec.poo.ui.Menu {

    /**
     * Cria o menu principal da aplicação.
     *
     * <p>Todos os comandos recebem a mesma instância de
     * {@link StoreManager}, que funciona como ponto de entrada para o
     * {@code core} da aplicação.</p>
     *
     * @param storeManager gestor da loja utilizado pelos comandos de menu
     */
    public Menu(StoreManager storeManager) {
        super(
                Label.TITLE,
                new Comando<?>[]{
                        new DoOpenClientsMenu(storeManager),
                        new DoOpenProductsMenu(storeManager),
                        new DoOpenSalesMenu(storeManager),
                        new DoOpenNotificationsMenu(storeManager),
                        new DoAdvanceDate(storeManager),
                        new DoShowStoreSummary(storeManager),
                        new DoShowStoreAdvancedDetails(storeManager),
                        new DoSaveState(storeManager),
                        new DoLoadState(storeManager)
                }
        );
    }
}