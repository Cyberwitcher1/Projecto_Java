package atec.poo.escola.app.turmas;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por listar as turmas existentes.
 *
 * As turmas deverão ser apresentadas por ordem alfabética
 * do respetivo código.
 */
public class DoListarTurmas extends Comando<SchoolManager> {

    /**
     * Cria o comando responsável pela listagem de turmas.
     *
     * @param schoolManager gestor da escola
     */
    public DoListarTurmas(SchoolManager schoolManager) {
        super(schoolManager, Label.LIST_CLASSES);
    }

    /**
     * Apresenta as turmas existentes.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A completar pelos alunos
    }
}