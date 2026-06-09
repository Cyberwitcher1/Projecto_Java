package atec.poo.escola.app.turmas;

/**
 * Textos utilizados no menu de gestão de turmas.
 */
public interface Label {

    /*
     * Menu
     */
    String TITLE = "MENU TURMAS";

    /*
     * Comandos
     */
    String CREATE_CLASS = "Criar turma";
    String ADD_STUDENT_TO_CLASS = "Adicionar aluno a uma turma";
    String LIST_CLASSES = "Listar turmas";
    String SHOW_CLASS = "Mostrar turma";

    /*
     * Prompts
     */
    String ASK_CLASS_CODE =
            "Insira o código da turma:";

    String ASK_PROFESSOR_ID =
            "Insira o ID do professor responsável:";

    String ASK_STUDENT_ID =
            "Insira o ID do aluno:";

    /*
     * Mensagens
     */
    String CLASS_CREATED_SUCCESS =
            "Turma \"%s\" criada com sucesso.";

    String STUDENT_ADDED_TO_CLASS_SUCCESS =
            "Aluno ID: %d adicionado com sucesso à turma \"%s\".";

    String LIST_CLASSES_TITLE =
            "---- Lista de Turmas [%d] ----";

    String CLASS_DETAILS_TITLE =
            "#### Ficha da Turma [%s] ####";

    String CLASS_DETAILS_FOOTER =
            "##################################";
}