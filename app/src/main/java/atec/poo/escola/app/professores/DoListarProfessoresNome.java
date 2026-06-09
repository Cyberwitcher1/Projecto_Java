package atec.poo.escola.app.professores;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por listar os professores por nome.
 *
 * Os professores deverão ser apresentados por ordem alfabética.
 * Caso existam professores com o mesmo nome, deverá surgir primeiro
 * o professor com o menor número.
 */
public class DoListarProfessoresNome extends Comando<SchoolManager> {

    /**
     * Cria o comando responsável pela listagem de professores por nome.
     *
     * @param schoolManager gestor da escola
     */
    public DoListarProfessoresNome(SchoolManager schoolManager) {
        super(schoolManager, Label.LIST_PROFESSORS_BY_NAME);
    }

    /**
     * Apresenta os professores ordenados por nome.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A completar pelos alunos
    }
}