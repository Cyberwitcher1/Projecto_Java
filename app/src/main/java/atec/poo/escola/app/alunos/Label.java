package atec.poo.escola.app.alunos;

/**
 * Textos utilizados no menu de gestão de alunos.
 */
public interface Label {

    /*
     * Menu
     */
    String TITLE = "MENU ALUNOS";

    /*
     * Comandos
     */
    String CREATE_STUDENT = "Criar aluno";
    String LIST_STUDENTS = "Listar alunos por nome";
    String LIST_STUDENTS_BY_AGE = "Listar alunos por idade";
    String SHOW_STUDENT = "Mostrar aluno";

    /*
     * Prompts
     */
    String ASK_STUDENT_NUMBER =
            "Insira o número do aluno:";

    String ASK_STUDENT_NAME =
            "Insira o nome do aluno:";

    String ASK_STUDENT_BIRTH_DATE =
            "Insira a data de nascimento do aluno (yyyy-mm-dd):";

    /*
     * Mensagens
     */
    String STUDENT_CREATED_SUCCESS =
            "Aluno número %d criado com sucesso.";

    String LIST_STUDENTS_BY_NAME_TITLE =
            "---- Lista de Alunos por Nome [%d] ----";

    String LIST_STUDENTS_BY_AGE_TITLE =
            "---- Lista de Alunos por Idade [%d] ----";

    String STUDENT_DETAILS_TITLE =
            "#### Ficha do Aluno [%d] ####";

    String STUDENT_DETAILS_FOOTER =
            "############################";
}