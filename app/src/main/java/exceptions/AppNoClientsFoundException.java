package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando uma pesquisa não encontra clientes.
 */
public class AppNoClientsFoundException
        extends DialogException {

    private final String searchTerm;

    /**
     * Cria uma exceção para uma pesquisa sem resultados.
     *
     * @param searchTerm termo utilizado na pesquisa
     */
    public AppNoClientsFoundException(
            String searchTerm
    ) {
        this.searchTerm = searchTerm;
    }

    /**
     * Devolve a mensagem apresentada ao utilizador.
     *
     * @return mensagem de erro
     */
    @Override
    public String getMessage() {
        return String.format(
                Label.NO_CLIENTS_FOUND,
                this.searchTerm
        );
    }
}