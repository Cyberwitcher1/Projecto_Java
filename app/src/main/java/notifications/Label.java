package atec.poo.loja.app.notifications;

/**
 * Labels utilizadas no menu de gestão de notificações.
 */
public interface Label {

    /*
     * Menu
     */
    String TITLE =
            "MENU NOTIFICAÇÕES";

    /*
     * Comandos
     */
    String READ_CLIENT_NOTIFICATIONS =
            "Consultar notificações de um cliente";

    String LIST_NOTIFICATION_HISTORY =
            "Consultar histórico de notificações";

    String LIST_ACTIVE_SUBSCRIPTIONS =
            "Listar subscrições ativas";

    /*
     * Prompts
     */
    String ASK_CLIENT_ID =
            "Insira o ID do cliente:";

    String ASK_CANCEL_ACTIVE_SUBSCRIPTIONS =
            "Pretende cancelar todas as subscrições ativas? (s/n):";

    /*
     * Mensagens
     */
    String CLIENT_NOTIFICATIONS_HEADER =
            "---- Notificações não lidas do Cliente [%03d] %s [%d] ----";

    String CLIENT_NOTIFICATION_ITEM =
            "-> [%03d] %s - %s - Produto: %s [%03d] - Preço: %.2f €";

    String NOTIFICATION_HISTORY_HEADER =
            "---- Histórico de Notificações [%d] ----";

    String NOTIFICATION_HISTORY_ITEM =
            "-> [%03d] %s - %s - Cliente: %s [%03d] - " +
                    "Produto: %s [%03d] - Preço: %.2f € - Estado: %s";

    String ACTIVE_SUBSCRIPTIONS_HEADER =
            "---- Subscrições Ativas [%d] ----";

    String ACTIVE_SUBSCRIPTION_ITEM =
            "-> %s - Cliente: %s [%03d] - Produto: %s [%03d] - " +
                    "Preço: %.2f € - Stock: %d";

    String CLIENT_SUBSCRIPTIONS_CANCELLED_SUCCESS =
            "Foram canceladas %d subscrições ativas do cliente [%d].";

    String CLIENT_SUBSCRIPTIONS_MAINTAINED =
            "As subscrições ativas do cliente [%d] foram mantidas.";
}