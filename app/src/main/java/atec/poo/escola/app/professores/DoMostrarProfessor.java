package atec.poo.escola.app.professores;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por apresentar a ficha de um professor.
 *
 * O utilizador deverá indicar o número do professor que pretende
 * consultar.
 */
public class DoMostrarProfessor extends Comando<SchoolManager> {

    /**
     * Cria o comando responsável pela consulta de um professor.
     *
     * @param schoolManager gestor da escola
     */
    public DoMostrarProfessor(SchoolManager schoolManager) {
        super(schoolManager, Label.SHOW_PROFESSOR);
    }

    /**
     * Apresenta os dados completos de um professor.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A completar pelos alunos
    }
}