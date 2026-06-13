package atec.poo.loja.app.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface Label {

    /*
     * Menu
     */
    String TITLE =
            "MENU PRINCIPAL";

    /*
     * Comandos
     */
    String OPEN_CLIENTS_MENU =
            "Abrir Gestão de clientes";

    String OPEN_PRODUCTS_MENU =
            "Abrir Gestão de produtos";

    String OPEN_SALES_MENU =
            "Abrir Gestão de Vendas";

    String OPEN_NOTIFICATIONS_MENU =
            "Abrir Gestão de Notificações";

    String ADVANCE_DATE =
            "Avançar data";

    String SHOW_STORE_SUMMARY =
            "Consultar resumo da loja";

    String SHOW_STORE_ADVANCED_DETAILS =
            "Consultar detalhes avançados da loja";

    String SAVE_STATE =
            "Guardar estado da aplicação";

    String LOAD_STATE =
            "Abrir estado da aplicação";

    /*
     * Prompts
     */
    String ASK_NUMBER_OF_DAYS =
            "Insira o número de dias a avançar:";

    String ASK_SAVE_FILENAME =
            "Insira o nome do ficheiro onde pretende guardar o estado da aplicação:";

    String ASK_LOAD_FILENAME =
            "Insira o nome do ficheiro que pretende abrir:";

    /*
     * Mensagens
     */
    String DATE_ADVANCED_SUCCESS =
            "Data avançada com sucesso. Data atual: %s.";

    String STORE_SUMMARY =
            "#### Resumo da Loja ####%n" +
                    "Data atual: %s%n" +
                    "Clientes registados: %d%n" +
                    "Produtos registados: %d%n" +
                    "Valor total das vendas: %.2f €%n" +
                    "Valor total do stock: %.2f €%n" +
                    "########################";

    String STORE_ADVANCED_DETAILS =
            "#### Detalhes Avançados da Loja ####%n" +
                    "Vendas nos últimos 10 dias: %.2f €%n" +
                    "Vendas nos últimos 30 dias: %.2f €%n" +
                    "Vendas nos últimos 60 dias: %.2f €%n" +
                    "Notificações geradas: %d%n" +
                    "Notificações não lidas: %d%n" +
                    "Subscrições ativas: %d%n" +
                    "###################################";

    String STATE_SAVED_SUCCESS =
            "Estado da aplicação guardado com sucesso no ficheiro \"%s\".";

    String STATE_LOADED_SUCCESS =
            "Estado da aplicação carregado com sucesso a partir do ficheiro \"%s\".";


}