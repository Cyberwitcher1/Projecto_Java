package atec.poo.escola.app.turmas;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por adicionar um aluno a uma turma.
 *
 * O comando deverá solicitar o código da turma e o identificador
 * do aluno.
 *
 * As validações das regras de negócio pertencem ao core.
 */
public class DoAdicionarAlunoTurma extends Comando<SchoolManager> {

    /**
     * Cria o comando responsável pela associação de alunos a turmas.
     *
     * @param schoolManager gestor da escola
     */
    public DoAdicionarAlunoTurma(SchoolManager schoolManager) {
        super(schoolManager, Label.ADD_STUDENT_TO_CLASS);
    }

    /**
     * Adiciona um aluno a uma turma.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A completar pelos alunos
    }
}