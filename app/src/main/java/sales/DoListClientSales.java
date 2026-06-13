package atec.poo.loja.app.sales;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.util.List;

/**
 * Comando responsável por listar as vendas
 * realizadas por um cliente.
 */
public class DoListClientSales
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por listar
     * as vendas de um cliente.
     *
     * @param storeManager gestor da loja
     */
    public DoListClientSales(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.LIST_CLIENT_SALES
        );
    }

    /**
     * Apresenta as vendas realizadas por um cliente.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        //TODO: a implementar pelos alunos
    }
}