package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando o número de meses
 * de garantia não é válido.
 */
public class AppInvalidWarrantyMonthsException
        extends DialogException {

    private final int warrantyMonths;

    public AppInvalidWarrantyMonthsException(
            int warrantyMonths
    ) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getMessage() {
        return String.format(
                Label.INVALID_WARRANTY_MONTHS,
                this.warrantyMonths
        );
    }
}