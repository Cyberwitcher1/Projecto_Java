package atec.poo.escola.app.alunos;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.time.LocalDate;

/**
 * Comando responsável por criar um novo aluno.
 *
 * O comando deverá solicitar o número, o nome e a data de nascimento
 * do aluno. A validação das regras de negócio pertence ao core.
 */
public class DoCreateStudent extends Comando<SchoolManager> {

    /**
     * Cria o comando responsável pelo registo de alunos.
     *
     * @param schoolManager gestor da escola
     */
    public DoCreateStudent(SchoolManager schoolManager) {
        super(schoolManager, Label.CREATE_STUDENT);
    }

    /**
     * Regista um novo aluno.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        //TODO: A desenvolver pelo alunos

        //Pedir dados ao user
        String nome=Prompt.studentName();
        //System.out.println(nome);
        LocalDate dataNascimento= Prompt.studentBirthDate();
        //System.out.println(dataNascimento.toString());
        //Posso necessitar de comunicar com o core
        int id=this.getReceptor().registStudent(nome,dataNascimento);
        //enviar os dados para o stdout
        Message.studentCreated(id);

    }
}