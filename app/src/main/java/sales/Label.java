package atec.poo.loja.app.sales;

/**
 * Labels utilizadas no menu de gestão de vendas.
 */
public interface Label {

    /*
     * Menu
     */
    String TITLE =
            "MENU VENDAS";

    /*
     * Comandos
     */
    String REGISTER_SALE =
            "Registar venda";

    String SHOW_SALE =
            "Ver venda";

    String LIST_SALES =
            "Listar vendas";

    String LIST_CLIENT_SALES =
            "Listar vendas de um cliente";

    /*
     * Prompts
     */
    String ASK_SALE_ID =
            "Insira o ID da venda:";

    String ASK_CLIENT_ID =
            "Insira o ID do cliente:";

    String ASK_PRODUCT_ID =
            "Insira o ID do produto:";

    String ASK_QUANTITY =
            "Insira a quantidade:";

    /*
     * Mensagens
     */
    /*
     * Mensagens
     */
    String SALE_REGISTERED_SUCCESS =
            "Venda ID: %d registada com sucesso.%n" +
                    "Total: %.2f €";

    String SALE_DETAILS =
            "#### Venda [%03d] ####%n" +
                    "Data: %s%n" +
                    "Cliente: %s [%03d]%n" +
                    "Produto: %s [%03d]%n" +
                    "Preço unitário: %.2f €%n" +
                    "Quantidade: %d%n" +
                    "Valor da venda: %.2f €%n" +
                    "#####################";

    String SALES_LIST_HEADER =
            "---- Lista de Vendas [%d] ----";

    String SALES_LIST_ITEM =
            "-> Venda [%03d] - %s - %s - %s - Qtd: %d - Total: %.2f €";

    String CLIENT_SALES_LIST_HEADER =
            "---- Vendas do Cliente [%03d] %s [%d] ----";

    String CLIENT_SALES_LIST_ITEM =
            "-> Venda [%03d] - %s - %s - Qtd: %d - Total: %.2f €";

    String ASK_SUBSCRIBE_PRODUCT_NOTIFICATIONS =
            "Pretende subscrever notificações para o produto? (s/n):";

    String SUBSCRIPTION_CREATED_SUCCESS =
            "Subscrição criada com sucesso para o cliente [%d] e produto [%d].";
}