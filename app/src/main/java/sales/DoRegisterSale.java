package atec.poo.loja.app.sales;

import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por registar uma venda.
 */
public class DoRegisterSale
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por registar uma venda.
     *
     * @param storeManager gestor da loja
     */
    public DoRegisterSale(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.REGISTER_SALE
        );
    }

    /**
     * Regista uma nova venda.
     *
     * <p>Quando não existe stock suficiente para satisfazer
     * a quantidade solicitada, permite ao cliente subscrever
     * notificações relativas ao produto.</p>
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar()
            throws DialogException {

        // TODO: A fazer pelos alunos

    }
}