package atec.poo.escola.app.turmas;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por apresentar a ficha de uma turma.
 *
 * O utilizador deverá indicar o código da turma que pretende
 * consultar.
 */
public class DoMostrarTurma extends Comando<SchoolManager> {

    /**
     * Cria o comando responsável pela consulta de uma turma.
     *
     * @param schoolManager gestor da escola
     */
    public DoMostrarTurma(SchoolManager schoolManager) {
        super(schoolManager, Label.SHOW_CLASS);
    }

    /**
     * Apresenta os dados completos de uma turma.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A completar pelos alunos
    }
}