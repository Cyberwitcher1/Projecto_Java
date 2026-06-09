package atec.poo.escola.app.alunos;

import atec.poo.escola.app.exceptions.AppStudentNotFoundException;
import atec.poo.escola.core.SchoolManager;
import atec.poo.escola.core.alunos.Aluno;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por apresentar a ficha de um aluno.
 *
 * O utilizador deverá indicar o número do aluno que pretende consultar.
 */
public class DoShowStudent extends Comando<SchoolManager> {

    /**
     * Cria o comando responsável pela consulta de um aluno.
     *
     * @param schoolManager gestor da escola
     */
    public DoShowStudent(SchoolManager schoolManager) {
        super(schoolManager, Label.SHOW_STUDENT);
    }

    /**
     * Apresenta os dados completos de um aluno.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        int id=Prompt.studentNumber();
        Aluno aluno=this.getReceptor().getStudentdetails(id);
        if(aluno==null)
            throw new AppStudentNotFoundException(id);
        Message.studentDetails(aluno.getId(), aluno.studentDetails());

    }
}