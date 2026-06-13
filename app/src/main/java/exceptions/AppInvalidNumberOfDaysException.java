package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção lançada quando o número de dias indicado para avançar
 * a data simulada da aplicação não é válido.
 */
public class AppInvalidNumberOfDaysException extends DialogException {

    /**
     * Número de dias introduzido pelo utilizador.
     */
    private final int numberOfDays;

    /**
     * Cria uma exceção para um número de dias inválido.
     *
     * @param numberOfDays número de dias introduzido pelo utilizador
     */
    public AppInvalidNumberOfDaysException(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    /**
     * Devolve a mensagem apresentada automaticamente pela framework
     * de UI.
     *
     * @return mensagem de erro
     */
    @Override
    public String getMessage() {
        return Label.invalidNumberOfDays(this.numberOfDays);
    }
}