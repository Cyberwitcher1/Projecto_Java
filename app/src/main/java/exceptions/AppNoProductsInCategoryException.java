package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando não existem produtos
 * na categoria selecionada.
 */
public class AppNoProductsInCategoryException
        extends DialogException {

    private final int categoryOption;

    public AppNoProductsInCategoryException(
            int categoryOption
    ) {
        this.categoryOption =
                categoryOption;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.NO_PRODUCTS_IN_CATEGORY,
                this.categoryOption
        );
    }
}