package atec.poo.loja.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

import java.time.LocalDate;

/**
 * Exceção lançada quando se tenta registar um cliente
 * que ainda não possui a idade mínima permitida.
 */
public class AppInvalidClientAgeException
        extends DialogException {

    /**
     * Data de nascimento introduzida para o cliente.
     */
    private final LocalDate birthDate;

    /**
     * Cria uma exceção para uma data de nascimento inválida.
     *
     * @param birthDate data de nascimento introduzida
     */
    public AppInvalidClientAgeException(
            LocalDate birthDate
    ) {
        this.birthDate = birthDate;
    }

    /**
     * Devolve a mensagem apresentada automaticamente pela framework UI.
     *
     * @return mensagem de erro
     */
    @Override
    public String getMessage() {
        return Label.invalidClientAge(
                this.birthDate
        );
    }
}