package atec.poo.loja.app.main;

import atec.poo.loja.app.exceptions.AppStateSaveException;
import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.io.IOException;

/**
 * Comando responsável por guardar o estado atual da aplicação.
 *
 * <p>O utilizador deverá indicar o nome do ficheiro onde pretende guardar
 * os dados da loja. A operação de serialização será delegada no
 * {@link StoreManager}.</p>
 */
public class DoSaveState
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por guardar o estado da aplicação.
     *
     * @param storeManager gestor da loja utilizado para executar a operação
     */
    public DoSaveState(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.SAVE_STATE
        );
    }

    /**
     * Executa a operação de gravação do estado da aplicação.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar()
            throws DialogException {

        // TODO: A completar pelos alunos


    }
}