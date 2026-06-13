package atec.poo.loja.core.exceptions;

import java.time.LocalDate;

public class InvalidClientException extends Exception {
    private LocalDate birthDate;

    public InvalidClientException(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
