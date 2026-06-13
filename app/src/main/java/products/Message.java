package atec.poo.loja.app.products;

import atec.poo.ui.Dialogo;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por apresentar as mensagens associadas
 * às operações de gestão de produtos.
 *
 * <p>Esta classe recebe apenas valores simples. Não recebe objetos
 * pertencentes ao core.</p>
 */
public final class Message {

    /**
     * Instância comum de diálogo utilizada para escrever os outputs.
     */
    public static final Dialogo ui = IO;

    /**
     * Impede a criação de instâncias desta classe utilitária.
     */
    private Message() {
    }

    /**
     * Apresenta uma mensagem a indicar que um produto foi registado.
     *
     * @param productId identificador atribuído ao produto
     */
    public static void productRegistered(int productId) {
        ui.escreveLinha(
                String.format(
                        Label.PRODUCT_REGISTERED_SUCCESS,
                        productId
                )
        );
    }

    /**
     * Apresenta os dados de um produto alimentar.
     *
     * @param productId      identificador do produto
     * @param name           nome do produto
     * @param category       categoria
     * @param price          preço atual
     * @param stock          stock atual
     * @param expirationDate data de validade
     */
    public static void foodProductDetails(
            int productId,
            String name,
            String category,
            double price,
            int stock,
            String expirationDate
    ) {
        ui.escreveLinha(
                String.format(
                        Label.FOOD_PRODUCT_DETAILS,
                        productId,
                        name,
                        category,
                        price,
                        stock,
                        expirationDate
                )
        );
    }

    /**
     * Apresenta os dados de um produto eletrónico.
     *
     * @param productId      identificador do produto
     * @param name           nome do produto
     * @param category       categoria
     * @param price          preço atual
     * @param stock          stock atual
     * @param warrantyMonths número de meses de garantia
     */
    public static void electronicProductDetails(
            int productId,
            String name,
            String category,
            double price,
            int stock,
            int warrantyMonths
    ) {
        ui.escreveLinha(
                String.format(
                        Label.ELECTRONIC_PRODUCT_DETAILS,
                        productId,
                        name,
                        category,
                        price,
                        stock,
                        warrantyMonths
                )
        );
    }

    /**
     * Apresenta os dados de um produto de vestuário.
     *
     * @param productId identificador do produto
     * @param name      nome do produto
     * @param category  categoria
     * @param price     preço atual
     * @param stock     stock atual
     * @param size      tamanho
     */
    public static void clothingProductDetails(
            int productId,
            String name,
            String category,
            double price,
            int stock,
            String size
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLOTHING_PRODUCT_DETAILS,
                        productId,
                        name,
                        category,
                        price,
                        stock,
                        size
                )
        );
    }

    /**
     * Apresenta o cabeçalho da lista de produtos.
     *
     * @param numberOfProducts número de produtos apresentados
     */
    public static void productsListHeader(
            int numberOfProducts
    ) {
        ui.escreveLinha(
                String.format(
                        Label.PRODUCTS_LIST_HEADER,
                        numberOfProducts
                )
        );
    }

    /**
     * Apresenta o cabeçalho da lista de produtos de uma categoria.
     *
     * @param category         categoria apresentada
     * @param numberOfProducts número de produtos apresentados
     */
    public static void productsByCategoryListHeader(
            String category,
            int numberOfProducts
    ) {
        ui.escreveLinha(
                String.format(
                        Label.PRODUCTS_BY_CATEGORY_LIST_HEADER,
                        category,
                        numberOfProducts
                )
        );
    }

    /**
     * Apresenta um produto numa lista.
     *
     * @param productId identificador do produto
     * @param name      nome do produto
     * @param category  categoria
     * @param price     preço atual
     * @param stock     stock atual
     */
    public static void productsListItem(
            int productId,
            String name,
            String category,
            double price,
            int stock
    ) {
        ui.escreveLinha(
                String.format(
                        Label.PRODUCTS_LIST_ITEM,
                        productId,
                        name,
                        category,
                        price,
                        stock
                )
        );
    }

    /**
     * Apresenta o cabeçalho dos resultados de uma pesquisa.
     *
     * @param searchTerm       termo pesquisado
     * @param numberOfProducts número de produtos encontrados
     */
    public static void productSearchHeader(
            String searchTerm,
            int numberOfProducts
    ) {
        ui.escreveLinha(
                String.format(
                        Label.PRODUCT_SEARCH_HEADER,
                        searchTerm,
                        numberOfProducts
                )
        );
    }

    /**
     * Apresenta um produto encontrado numa pesquisa.
     *
     * @param productId identificador do produto
     * @param name      nome do produto
     * @param category  categoria
     * @param price     preço atual
     * @param stock     stock atual
     */
    public static void productSearchItem(
            int productId,
            String name,
            String category,
            double price,
            int stock
    ) {
        ui.escreveLinha(
                String.format(
                        Label.PRODUCT_SEARCH_ITEM,
                        productId,
                        name,
                        category,
                        price,
                        stock
                )
        );
    }

    /**
     * Apresenta uma mensagem a indicar que o preço foi alterado.
     *
     * @param productId identificador do produto
     * @param oldPrice  preço anterior
     * @param newPrice  novo preço
     */
    public static void productPriceChanged(
            int productId,
            double oldPrice,
            double newPrice
    ) {
        ui.escreveLinha(
                String.format(
                        Label.PRODUCT_PRICE_CHANGED_SUCCESS,
                        productId,
                        oldPrice,
                        newPrice
                )
        );
    }

    /**
     * Apresenta uma mensagem a indicar que os preços de uma categoria
     * foram aumentados.
     *
     * @param category         categoria alterada
     * @param percentage       percentagem aplicada
     * @param numberOfProducts número de produtos alterados
     */
    public static void categoryPricesIncreased(
            String category,
            double percentage,
            int numberOfProducts
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CATEGORY_PRICES_INCREASED_SUCCESS,
                        numberOfProducts,
                        category,
                        percentage
                )
        );
    }

    /**
     * Apresenta uma mensagem a indicar que foram adicionadas unidades
     * ao stock de um produto.
     *
     * @param productId identificador do produto
     * @param quantity  quantidade adicionada
     * @param newStock  stock resultante
     */
    public static void productStockAdded(
            int productId,
            int quantity,
            int newStock
    ) {
        ui.escreveLinha(
                String.format(
                        Label.PRODUCT_STOCK_ADDED_SUCCESS,
                        quantity,
                        productId,
                        newStock
                )
        );
    }

    /**
     * Apresenta o cabeçalho do histórico de preços.
     *
     * @param productId       identificador do produto
     * @param productName     nome do produto
     * @param numberOfEntries número de registos apresentados
     */
    public static void productPriceHistoryHeader(
            int productId,
            String productName,
            int numberOfEntries
    ) {
        ui.escreveLinha(
                String.format(
                        Label.PRODUCT_PRICE_HISTORY_HEADER,
                        productId,
                        productName,
                        numberOfEntries
                )
        );
    }

    /**
     * Apresenta um registo do histórico de preços.
     *
     * @param date  data do registo
     * @param price preço praticado
     */
    public static void productPriceHistoryItem(
            String date,
            double price
    ) {
        ui.escreveLinha(
                String.format(
                        Label.PRODUCT_PRICE_HISTORY_ITEM,
                        date,
                        price
                )
        );
    }
}