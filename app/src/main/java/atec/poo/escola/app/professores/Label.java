package atec.poo.escola.app.professores;

/**
 * Textos utilizados no menu de gestão de professores.
 */
public interface Label {

    /*
     * Menu
     */
    String TITLE = "MENU PROFESSORES";

    /*
     * Comandos
     */
    String ADD_PROFESSOR = "Adicionar professor";
    String LIST_PROFESSORS_BY_AGE = "Listar professores por idade";
    String LIST_PROFESSORS_BY_NAME = "Listar professores por nome";
    String SHOW_PROFESSOR = "Mostrar professor";

    /*
     * Prompts
     */
    String ASK_PROFESSOR_NUMBER =
            "Insira o número do professor:";

    String ASK_PROFESSOR_NAME =
            "Insira o nome do professor:";

    String ASK_PROFESSOR_BIRTH_DATE =
            "Insira a data de nascimento do professor (dd/MM/yyyy):";

    /*
     * Mensagens
     */
    String PROFESSOR_CREATED_SUCCESS =
            "Professor número %d criado com sucesso.";

    String LIST_PROFESSORS_BY_AGE_TITLE =
            "---- Lista de Professores por Idade [%d] ----";

    String LIST_PROFESSORS_BY_NAME_TITLE =
            "---- Lista de Professores por Nome [%d] ----";

    String PROFESSOR_DETAILS_TITLE =
            "#### Ficha do Professor [%d] ####";

    String PROFESSOR_DETAILS_FOOTER =
            "#################################";
}