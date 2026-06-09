package atec.poo.escola.app.main;

/**
 * Textos utilizados no menu principal.
 */
public interface Label {

    /*
     * Menu
     */
    String TITLE = "-- MENU PRINCIPAL --";

    /*
     * Comandos
     */
    String OPEN_MENU_ALUNOS = "Abrir gestão de alunos";
    String OPEN_MENU_PROFESSORES = "Abrir gestão de professores";
    String OPEN_MENU_TURMAS = "Abrir gestão de turmas";
    String SHOW_SCHOOL_SUMMARY = "Consultar resumo da escola";

    /*
     * Mensagens
     */
    String SCHOOL_SUMMARY =
            """
            #### Resumo da Escola ####
            Número de alunos: %d
            Número de professores: %d
            Número de turmas: %d
            ##########################
            """;
}