package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não existem clientes registados.
 */
public class AppNoClientsRegisteredException
        extends DialogException {

    /**
     * Devolve a mensagem apresentada ao utilizador.
     *
     * @return mensagem de erro
     */
    @Override
    public String getMessage() {
        return Label.NO_CLIENTS_REGISTERED;
    }
}