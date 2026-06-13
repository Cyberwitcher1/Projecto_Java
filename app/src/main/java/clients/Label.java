package atec.poo.loja.app.clients;

/**
 * Labels utilizadas no menu de gestão de clientes.
 */
public interface Label {

    /*
     * Menu
     */
    String TITLE = "MENU CLIENTES";

    /*
     * Comandos
     */
    String REGISTER_CLIENT = "Registar cliente";
    String SHOW_CLIENT = "Ver cliente";
    String LIST_CLIENTS = "Listar clientes";
    String LIST_CLIENTS_BY_AGE = "Listar clientes por idade";
    String CHANGE_CLIENT_NAME = "Alterar nome do cliente";
    String SEARCH_CLIENTS =
            "Pesquisar clientes";

    /*
     * Prompts
     */
    String ASK_CLIENT_NAME =
            "Insira o nome do cliente:";

    String ASK_CLIENT_NIF =
            "Insira o NIF do cliente:";

    String ASK_CLIENT_BIRTH_DATE =
            "Insira a data de nascimento do cliente:";

    String ASK_CLIENT_ID =
            "Insira o ID do cliente:";

    String ASK_NEW_CLIENT_NAME =
            "Insira o novo nome do cliente:";

    String ASK_SEARCH_TERM =
            "Insira o termo de pesquisa:";


    String CLIENT_REGISTERED_SUCCESS =
            "Cliente ID: %d criado com sucesso.";

    String CLIENT_DETAILS =
            "#### Ficha de Cliente [%03d] ####%n" +
                    "Nome: %s%n" +
                    "NIF: %s%n" +
                    "Data de nascimento: %s%n" +
                    "Idade: %d anos%n" +
                    "Status: %s%n" +
                    "################################";

    String CLIENTS_LIST_HEADER =
            "---- Lista de Clientes [%d] ----";

    String CLIENTS_LIST_ITEM =
            "-> [%03d] %s - NIF: %s";

    String CLIENTS_BY_AGE_LIST_HEADER =
            "---- Lista de Clientes por Idade [%d] ----";

    String CLIENTS_BY_AGE_LIST_ITEM =
            "-> [%03d] %s - Idade: %d - Status: %s";

    String CLIENT_NAME_CHANGED_SUCCESS =
            "Nome do cliente [%d] foi alterado de %s para %s.";

    String CLIENT_SEARCH_HEADER =
            "---- Resultado da Pesquisa [%d] ----";

    String CLIENT_SEARCH_ITEM =
            "-> [%03d] %s - NIF: %s - Status: %s";
}