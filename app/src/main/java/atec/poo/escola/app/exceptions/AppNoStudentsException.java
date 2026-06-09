package atec.poo.escola.app.exceptions;

import atec.poo.ui.exceptions.DialogException;

/**
 * Exceção apresentada quando se tenta listar alunos,
 * mas ainda não existem alunos registados.
 */
public class AppNoStudentsException extends DialogException {

    @Override
    public String getMessage() {
        return Label.NO_STUDENTS;
    }
}