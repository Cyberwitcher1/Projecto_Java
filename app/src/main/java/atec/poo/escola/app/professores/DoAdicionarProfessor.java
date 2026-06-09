package atec.poo.escola.app.professores;

import atec.poo.escola.app.professores.Message;
import atec.poo.escola.app.professores.Prompt;
import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.time.LocalDate;

/**
 * Comando responsável por adicionar um novo professor.
 *
 * O comando deverá solicitar o número, o nome e a data de nascimento
 * do professor. A validação das regras de negócio pertence ao core.
 */
public class DoAdicionarProfessor extends Comando<SchoolManager> {
    /**
     * Cria o comando responsável pelo registo de professores.
     *
     * @param schoolManager gestor da escola
     */
    public DoAdicionarProfessor(SchoolManager schoolManager) {
        super(schoolManager, Label.ADD_PROFESSOR);
    }

    /**
     * Adiciona um novo professor.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        // TODO: A completar pelos alunos
        String nome= Prompt.professorName();
        LocalDate dataNascimento= Prompt.professorBirthDate();
        int id=this.getReceptor().registProfessor(nome,dataNascimento);
        Message.professorCreated(id);

    }
}