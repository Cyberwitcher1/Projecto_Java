package atec.poo.escola.app.alunos;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por listar os alunos por idade.
 *
 * Os alunos mais velhos deverão surgir primeiro.
 * Caso existam alunos com a mesma idade, deverão ser ordenados
 * alfabeticamente pelo nome.
 */
public class DoListStudentsByAge extends Comando<SchoolManager> {

    /**
     * Cria o comando responsável pela listagem de alunos por idade.
     *
     * @param schoolManager gestor da escola
     */
    public DoListStudentsByAge(SchoolManager schoolManager) {
        super(schoolManager, Label.LIST_STUDENTS_BY_AGE);
    }

    /**
     * Apresenta os alunos ordenados por idade.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A completar pelos alunos
    }
}