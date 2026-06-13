package atec.poo.loja.app.main;

import atec.poo.ui.Dialogo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por apresentar as mensagens associadas
 * às operações disponíveis no menu principal.
 */
public final class Message {

    /**
     * Instância comum de diálogo utilizada para escrever os outputs
     * da aplicação.
     */
    public static final Dialogo ui = IO;

    /**
     * Formatador utilizado para apresentar datas no formato
     * {@code dd/MM/yyyy}.
     */
    private static final DateTimeFormatter DATE_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * Impede a criação de instâncias desta classe utilitária.
     */
    private Message() {
    }



    /**
     * Apresenta uma mensagem a indicar que a data da aplicação foi
     * avançada com sucesso.
     *
     * @param currentDate nova data atual da aplicação
     */
    public static void dateAdvanced(LocalDate currentDate) {
        ui.escreveLinha(
                String.format(
                        Label.DATE_ADVANCED_SUCCESS,
                        currentDate.format(DATE_FORMATTER)
                )
        );
    }

    /**
     * Apresenta uma mensagem a indicar que o estado da aplicação foi
     * guardado com sucesso.
     *
     * @param filename nome do ficheiro onde o estado foi guardado
     */
    public static void stateSaved(String filename) {
        ui.escreveLinha(
                String.format(
                        Label.STATE_SAVED_SUCCESS,
                        filename
                )
        );
    }

    /**
     * Apresenta uma mensagem a indicar que o estado da aplicação foi
     * carregado com sucesso.
     *
     * @param filename nome do ficheiro a partir do qual o estado foi carregado
     */
    public static void stateLoaded(String filename) {
        ui.escreveLinha(
                String.format(
                        Label.STATE_LOADED_SUCCESS,
                        filename
                )
        );
    }

    /**
     * Apresenta um resumo geral da loja.
     *
     * @param today             data simulada atual
     * @param numberOfClients   número de clientes registados
     * @param numberOfProducts  número de produtos registados
     * @param totalSalesValue   valor total das vendas
     * @param totalStockValue   valor atual dos produtos em stock
     */
    public static void storeSummary(
            String today,
            int numberOfClients,
            int numberOfProducts,
            double totalSalesValue,
            double totalStockValue
    ) {
        ui.escreveLinha(
                String.format(
                        Label.STORE_SUMMARY,
                        today,
                        numberOfClients,
                        numberOfProducts,
                        totalSalesValue,
                        totalStockValue
                )
        );
    }

    /**
     * Apresenta os detalhes avançados da atividade da loja.
     *
     * @param totalSalesLast10Days          vendas dos últimos 10 dias
     * @param totalSalesLast30Days          vendas dos últimos 30 dias
     * @param totalSalesLast60Days          vendas dos últimos 60 dias
     * @param numberOfNotifications         notificações geradas
     * @param numberOfUnreadNotifications   notificações ainda não lidas
     * @param numberOfActiveSubscriptions   subscrições ativas
     */
    public static void storeAdvancedDetails(
            double totalSalesLast10Days,
            double totalSalesLast30Days,
            double totalSalesLast60Days,
            int numberOfNotifications,
            int numberOfUnreadNotifications,
            int numberOfActiveSubscriptions
    ) {
        ui.escreveLinha(
                String.format(
                        Label.STORE_ADVANCED_DETAILS,
                        totalSalesLast10Days,
                        totalSalesLast30Days,
                        totalSalesLast60Days,
                        numberOfNotifications,
                        numberOfUnreadNotifications,
                        numberOfActiveSubscriptions
                )
        );
    }
}