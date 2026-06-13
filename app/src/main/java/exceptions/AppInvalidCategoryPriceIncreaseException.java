package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando a percentagem de aumento
 * dos preços não é válida.
 */
public class AppInvalidCategoryPriceIncreaseException
        extends DialogException {

    private final double percentage;

    public AppInvalidCategoryPriceIncreaseException(
            double percentage
    ) {
        this.percentage = percentage;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.INVALID_CATEGORY_PRICE_INCREASE,
                this.percentage
        );
    }
}