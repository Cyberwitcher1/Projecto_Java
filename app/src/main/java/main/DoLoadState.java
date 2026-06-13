package atec.poo.loja.app.main;

import atec.poo.loja.app.exceptions.AppStateLoadException;
import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.io.IOException;

/**
 * Comando responsável por abrir um estado da aplicação anteriormente
 * guardado.
 *
 * <p>O utilizador deverá indicar o nome do ficheiro que pretende abrir.
 * A operação de desserialização será delegada no {@link StoreManager}.</p>
 */
public class DoLoadState
        extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por abrir um estado guardado da aplicação.
     *
     * @param storeManager gestor da loja utilizado para executar a operação
     */
    public DoLoadState(
            StoreManager storeManager
    ) {
        super(
                storeManager,
                Label.LOAD_STATE
        );
    }

    /**
     * Executa a operação de abertura de um estado guardado.
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