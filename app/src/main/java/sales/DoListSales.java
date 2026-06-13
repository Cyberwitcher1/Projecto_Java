package atec.poo.loja.app.sales;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.util.List;

/**
 * Comando responsável por listar todas as vendas.
 */
public class DoListSales
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por listar as vendas.
     *
     * @param storeManager gestor da loja
     */
    public DoListSales(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.LIST_SALES
        );
    }

    /**
     * Apresenta as vendas registadas.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos

    }
}