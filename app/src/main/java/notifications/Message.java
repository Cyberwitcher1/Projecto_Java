package atec.poo.loja.app.notifications;

import atec.poo.ui.Dialogo;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por apresentar as mensagens associadas
 * às operações de gestão de notificações.
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
     * Apresenta o cabeçalho das notificações ainda não lidas
     * de um cliente.
     *
     * @param clientId              identificador do cliente
     * @param clientName            nome do cliente
     * @param numberOfNotifications número de notificações apresentadas
     */
    public static void clientNotificationsHeader(
            int clientId,
            String clientName,
            int numberOfNotifications
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENT_NOTIFICATIONS_HEADER,
                        clientId,
                        clientName,
                        numberOfNotifications
                )
        );
    }

    /**
     * Apresenta uma notificação ainda não lida de um cliente.
     *
     * @param notificationId identificador da notificação
     * @param date           data da notificação
     * @param type           tipo de alteração
     * @param productName    nome do produto
     * @param productId      identificador do produto
     * @param price          preço do produto na data da alteração
     */
    public static void clientNotificationItem(
            int notificationId,
            String date,
            String type,
            String productName,
            int productId,
            double price
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENT_NOTIFICATION_ITEM,
                        notificationId,
                        date,
                        type,
                        productName,
                        productId,
                        price
                )
        );
    }

    /**
     * Apresenta o cabeçalho do histórico completo de notificações.
     *
     * @param numberOfNotifications número de notificações apresentadas
     */
    public static void notificationHistoryHeader(
            int numberOfNotifications
    ) {
        ui.escreveLinha(
                String.format(
                        Label.NOTIFICATION_HISTORY_HEADER,
                        numberOfNotifications
                )
        );
    }

    /**
     * Apresenta uma notificação no histórico completo da loja.
     *
     * @param notificationId identificador da notificação
     * @param date           data da notificação
     * @param type           tipo de alteração
     * @param clientName     nome do cliente
     * @param clientId       identificador do cliente
     * @param productName    nome do produto
     * @param productId      identificador do produto
     * @param price          preço do produto na data da alteração
     * @param status         estado de leitura
     */
    public static void notificationHistoryItem(
            int notificationId,
            String date,
            String type,
            String clientName,
            int clientId,
            String productName,
            int productId,
            double price,
            String status
    ) {
        ui.escreveLinha(
                String.format(
                        Label.NOTIFICATION_HISTORY_ITEM,
                        notificationId,
                        date,
                        type,
                        clientName,
                        clientId,
                        productName,
                        productId,
                        price,
                        status
                )
        );
    }

    /**
     * Apresenta o cabeçalho da lista de subscrições ativas.
     *
     * @param numberOfSubscriptions número de subscrições apresentadas
     */
    public static void activeSubscriptionsHeader(
            int numberOfSubscriptions
    ) {
        ui.escreveLinha(
                String.format(
                        Label.ACTIVE_SUBSCRIPTIONS_HEADER,
                        numberOfSubscriptions
                )
        );
    }

    /**
     * Apresenta uma subscrição ativa.
     *
     * @param date        data da subscrição
     * @param clientName  nome do cliente
     * @param clientId    identificador do cliente
     * @param productName nome do produto
     * @param productId   identificador do produto
     * @param price       preço atual do produto
     * @param stock       stock atual do produto
     */
    public static void activeSubscriptionItem(
            String date,
            String clientName,
            int clientId,
            String productName,
            int productId,
            double price,
            int stock
    ) {
        ui.escreveLinha(
                String.format(
                        Label.ACTIVE_SUBSCRIPTION_ITEM,
                        date,
                        clientName,
                        clientId,
                        productName,
                        productId,
                        price,
                        stock
                )
        );
    }

    /**
     * Apresenta uma mensagem com o número de subscrições canceladas.
     *
     * @param clientId                       identificador do cliente
     * @param numberOfCancelledSubscriptions número de subscrições canceladas
     */
    public static void clientSubscriptionsCancelled(
            int clientId,
            int numberOfCancelledSubscriptions
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENT_SUBSCRIPTIONS_CANCELLED_SUCCESS,
                        numberOfCancelledSubscriptions,
                        clientId
                )
        );
    }

    /**
     * Indica que as subscrições ativas do cliente foram mantidas.
     *
     * @param clientId identificador do cliente
     */
    public static void clientSubscriptionsMaintained(
            int clientId
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENT_SUBSCRIPTIONS_MAINTAINED,
                        clientId
                )
        );
    }
}