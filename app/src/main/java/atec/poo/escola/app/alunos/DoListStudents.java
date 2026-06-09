package atec.poo.escola.app.alunos;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por listar os alunos por nome.
 *
 * Os alunos deverão ser apresentados por ordem alfabética.
 * Caso existam alunos com o mesmo nome, deverá surgir primeiro
 * o aluno com o menor número.
 */
public class DoListStudents extends Comando<SchoolManager> {

    /**
     * Cria o comando responsável pela listagem de alunos por nome.
     *
     * @param schoolManager gestor da escola
     */
    public DoListStudents(SchoolManager schoolManager) {
        super(schoolManager, Label.LIST_STUDENTS);
    }

    /**
     * Apresenta os alunos ordenados por nome.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A completar pelos alunos
        Message.studentsOrderedByName(this.getReceptor().listaAlunosNome());
    }
}