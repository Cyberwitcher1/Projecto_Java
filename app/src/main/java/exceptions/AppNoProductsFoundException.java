package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando uma pesquisa não encontra produtos.
 */
public class AppNoProductsFoundException
        extends DialogException {

    private final String searchTerm;

    public AppNoProductsFoundException(
            String searchTerm
    ) {
        this.searchTerm = searchTerm;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.NO_PRODUCTS_FOUND,
                this.searchTerm
        );
    }
}