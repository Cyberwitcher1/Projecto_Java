package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não existe um cliente com o ID indicado.
 */
public class AppNoSuchClientException extends DialogException {

    /**
     * Identificador do cliente pesquisado.
     */
    private final int clientId;

    /**
     * Cria uma exceção para um cliente inexistente.
     *
     * @param clientId identificador pesquisado
     */
    public AppNoSuchClientException(int clientId) {
        this.clientId = clientId;
    }

    /**
     * Devolve a mensagem apresentada ao utilizador.
     *
     * @return mensagem de erro
     */
    @Override
    public String getMessage() {
        return String.format(
                Label.NO_SUCH_CLIENT,
                this.clientId
        );
    }
}