package atec.poo.loja.app.products;

/**
 * Labels utilizadas no menu de gestão de produtos.
 */
public interface Label {

    /*
     * Menu
     */
    String TITLE =
            "MENU PRODUTOS";

    /*
     * Comandos
     */
    String REGISTER_PRODUCT =
            "Registar produto";

    String SHOW_PRODUCT =
            "Ver produto";

    String LIST_PRODUCTS =
            "Listar produtos";

    String LIST_PRODUCTS_BY_CATEGORY =
            "Listar produtos por categoria";

    String SEARCH_PRODUCTS =
            "Pesquisar produtos";

    String CHANGE_PRODUCT_PRICE =
            "Alterar preço do produto";

    String INCREASE_CATEGORY_PRICES =
            "Aumentar preços de uma categoria";

    String ADD_PRODUCT_STOCK =
            "Adicionar stock ao produto";

    String SHOW_PRODUCT_PRICE_HISTORY =
            "Consultar histórico de preços";

    /*
     * Prompts
     */
    String ASK_PRODUCT_ID =
            "Insira o ID do produto:";

    String ASK_PRODUCT_NAME =
            "Insira o nome do produto:";

    String ASK_PRODUCT_PRICE =
            "Insira o preço do produto:";

    String ASK_INITIAL_STOCK =
            "Insira o stock inicial do produto:";

    String ASK_PRODUCT_CATEGORY =
            "Escolha a categoria do produto:";

    String ASK_EXPIRATION_DATE =
            "Insira a data de validade do produto:";

    String ASK_WARRANTY_MONTHS =
            "Insira o número de meses de garantia:";

    String ASK_CLOTHING_SIZE =
            "Escolha o tamanho do produto:";

    String ASK_SEARCH_TERM =
            "Insira o termo de pesquisa:";

    String ASK_NEW_PRODUCT_PRICE =
            "Insira o novo preço do produto:";

    String ASK_PERCENTAGE_INCREASE =
            "Insira a percentagem de aumento:";

    String ASK_STOCK_QUANTITY =
            "Insira a quantidade a adicionar ao stock:";

    /*
     * Mensagens
     */
    String PRODUCT_REGISTERED_SUCCESS =
            "Produto ID: %d criado com sucesso.";

    String FOOD_PRODUCT_DETAILS =
            "#### Ficha de Produto [%03d] ####%n" +
                    "Nome: %s%n" +
                    "Categoria: %s%n" +
                    "Preço: %.2f €%n" +
                    "Stock: %d%n" +
                    "Data de validade: %s%n" +
                    "##################################";

    String ELECTRONIC_PRODUCT_DETAILS =
            "#### Ficha de Produto [%03d] ####%n" +
                    "Nome: %s%n" +
                    "Categoria: %s%n" +
                    "Preço: %.2f €%n" +
                    "Stock: %d%n" +
                    "Garantia: %d meses%n" +
                    "##################################";

    String CLOTHING_PRODUCT_DETAILS =
            "#### Ficha de Produto [%03d] ####%n" +
                    "Nome: %s%n" +
                    "Categoria: %s%n" +
                    "Preço: %.2f €%n" +
                    "Stock: %d%n" +
                    "Tamanho: %s%n" +
                    "##################################";

    String PRODUCTS_LIST_HEADER =
            "---- Lista de Produtos [%d] ----";

    String PRODUCTS_BY_CATEGORY_LIST_HEADER =
            "---- Lista de Produtos da Categoria %s [%d] ----";

    String PRODUCTS_LIST_ITEM =
            "-> [%03d] %s - Categoria: %s - %.2f € - Stock: %d";

    String PRODUCT_SEARCH_HEADER =
            "---- Resultado da Pesquisa \"%s\" [%d] ----";

    String PRODUCT_SEARCH_ITEM =
            "-> [%03d] %s - Categoria: %s - %.2f € - Stock: %d";

    String PRODUCT_PRICE_CHANGED_SUCCESS =
            "Preço do produto [%d] alterado de %.2f € para %.2f €.";

    String CATEGORY_PRICES_INCREASED_SUCCESS =
            "Preço de %d produtos da categoria %s aumentado em %.2f%%.";

    String PRODUCT_STOCK_ADDED_SUCCESS =
            "Foram adicionadas %d unidades ao produto [%d]. Novo stock: %d.";

    String PRODUCT_PRICE_HISTORY_HEADER =
            "---- Histórico de Preços do Produto [%03d] %s [%d] ----";

    String PRODUCT_PRICE_HISTORY_ITEM =
            "-> %s - %.2f €";


}