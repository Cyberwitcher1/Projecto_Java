package atec.poo.escola.app.professores;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por listar os professores por idade.
 *
 * Os professores mais velhos deverão surgir primeiro.
 * Caso existam professores com a mesma idade, deverão ser ordenados
 * alfabeticamente pelo nome.
 */
public class DoListarProfessoresIdade extends Comando<SchoolManager> {

    /**
     * Cria o comando responsável pela listagem de professores por idade.
     *
     * @param schoolManager gestor da escola
     */
    public DoListarProfessoresIdade(SchoolManager schoolManager) {
        super(schoolManager, Label.LIST_PROFESSORS_BY_AGE);
    }

    /**
     * Apresenta os professores ordenados por idade.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A completar pelos alunos
    }
}