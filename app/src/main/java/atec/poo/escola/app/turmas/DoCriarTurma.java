package atec.poo.escola.app.turmas;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por criar uma nova turma.
 *
 * O comando deverá solicitar o código da turma e o identificador
 * do professor responsável.
 *
 * As validações das regras de negócio pertencem ao core.
 */
public class DoCriarTurma extends Comando<SchoolManager> {

    /**
     * Cria o comando responsável pela criação de turmas.
     *
     * @param schoolManager gestor da escola
     */
    public DoCriarTurma(SchoolManager schoolManager) {
        super(schoolManager, Label.CREATE_CLASS);
    }

    /**
     * Cria uma nova turma.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A completar pelos alunos
    }
}