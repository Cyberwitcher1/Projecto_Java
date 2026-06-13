package atec.poo.loja.app.sales;

import atec.poo.ui.Dialogo;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por apresentar as mensagens associadas
 * às operações de gestão de vendas.
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
     * Apresenta uma mensagem a indicar que uma venda foi registada.
     *
     * @param saleId identificador atribuído à venda
     * @param total  valor total da venda
     */
    public static void saleRegistered(
            int saleId,
            double total
    ) {
        ui.escreveLinha(
                String.format(
                        Label.SALE_REGISTERED_SUCCESS,
                        saleId,
                        total
                )
        );
    }

    /**
     * Apresenta os dados detalhados de uma venda.
     *
     * @param saleId      identificador da venda
     * @param date        data da venda
     * @param clientName  nome do cliente
     * @param clientId    identificador do cliente
     * @param productName nome do produto
     * @param productId   identificador do produto
     * @param unitPrice   preço unitário praticado
     * @param quantity    quantidade adquirida
     * @param total       valor total da venda
     */
    public static void saleDetails(
            int saleId,
            String date,
            String clientName,
            int clientId,
            String productName,
            int productId,
            double unitPrice,
            int quantity,
            double total
    ) {
        ui.escreveLinha(
                String.format(
                        Label.SALE_DETAILS,
                        saleId,
                        date,
                        clientName,
                        clientId,
                        productName,
                        productId,
                        unitPrice,
                        quantity,
                        total
                )
        );
    }

    /**
     * Apresenta o cabeçalho da lista de vendas.
     *
     * @param numberOfSales número de vendas apresentadas
     */
    public static void salesListHeader(
            int numberOfSales
    ) {
        ui.escreveLinha(
                String.format(
                        Label.SALES_LIST_HEADER,
                        numberOfSales
                )
        );
    }

    /**
     * Apresenta uma venda na listagem geral.
     *
     * @param saleId      identificador da venda
     * @param date        data da venda
     * @param clientName  nome do cliente
     * @param productName nome do produto
     * @param quantity    quantidade adquirida
     * @param total       valor total da venda
     */
    public static void salesListItem(
            int saleId,
            String date,
            String clientName,
            String productName,
            int quantity,
            double total
    ) {
        ui.escreveLinha(
                String.format(
                        Label.SALES_LIST_ITEM,
                        saleId,
                        date,
                        clientName,
                        productName,
                        quantity,
                        total
                )
        );
    }

    /**
     * Apresenta o cabeçalho da lista de vendas de um cliente.
     *
     * @param clientId      identificador do cliente
     * @param clientName    nome do cliente
     * @param numberOfSales número de vendas apresentadas
     */
    public static void clientSalesListHeader(
            int clientId,
            String clientName,
            int numberOfSales
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENT_SALES_LIST_HEADER,
                        clientId,
                        clientName,
                        numberOfSales
                )
        );
    }

    /**
     * Apresenta uma venda na listagem das vendas de um cliente.
     *
     * @param saleId      identificador da venda
     * @param date        data da venda
     * @param productName nome do produto
     * @param quantity    quantidade adquirida
     * @param total       valor total da venda
     */
    public static void clientSalesListItem(
            int saleId,
            String date,
            String productName,
            int quantity,
            double total
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENT_SALES_LIST_ITEM,
                        saleId,
                        date,
                        productName,
                        quantity,
                        total
                )
        );
    }

    /**
     * Apresenta uma mensagem a indicar que a subscrição
     * foi criada com sucesso.
     *
     * @param clientId  identificador do cliente
     * @param productId identificador do produto
     */
    public static void subscriptionCreated(
            int clientId,
            int productId
    ) {
        ui.escreveLinha(
                String.format(
                        Label.SUBSCRIPTION_CREATED_SUCCESS,
                        clientId,
                        productId
                )
        );
    }
}