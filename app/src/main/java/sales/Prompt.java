package atec.poo.loja.app.sales;

import atec.poo.ui.Dialogo;
import atec.poo.ui.LerBoolean;
import atec.poo.ui.LerInteiro;
import atec.poo.ui.exceptions.DialogException;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por solicitar ao utilizador os valores
 * necessários às operações relacionadas com vendas.
 *
 * <p>Esta classe não recebe nem devolve objetos do core.</p>
 */
public final class Prompt {

    /**
     * Instância comum de diálogo utilizada para ler os inputs.
     */
    public static final Dialogo ui = IO;

    /**
     * Impede a criação de instâncias desta classe utilitária.
     */
    private Prompt() {
    }

    /**
     * Solicita o identificador de uma venda.
     *
     * @return identificador introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int saleId()
            throws DialogException {

        LerInteiro input =
                new LerInteiro(
                        Label.ASK_SALE_ID
                );

        ui.lerInput(
                input
        );

        return input.getValor();
    }

    /**
     * Solicita o identificador de um cliente.
     *
     * @return identificador introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int clientId()
            throws DialogException {

        LerInteiro input =
                new LerInteiro(
                        Label.ASK_CLIENT_ID
                );

        ui.lerInput(
                input
        );

        return input.getValor();
    }

    /**
     * Solicita o identificador de um produto.
     *
     * @return identificador introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int productId()
            throws DialogException {

        LerInteiro input =
                new LerInteiro(
                        Label.ASK_PRODUCT_ID
                );

        ui.lerInput(
                input
        );

        return input.getValor();
    }

    /**
     * Solicita a quantidade de unidades a adquirir.
     *
     * @return quantidade introduzida
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int quantity()
            throws DialogException {

        LerInteiro input =
                new LerInteiro(
                        Label.ASK_QUANTITY
                );

        ui.lerInput(
                input
        );

        return input.getValor();
    }

    /**
     * Pergunta se o cliente pretende subscrever notificações
     * relativas ao produto.
     *
     * @return {@code true} se o cliente responder afirmativamente;
     *         {@code false} caso contrário
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static boolean subscribeProductNotifications()
            throws DialogException {

        LerBoolean input =
                new LerBoolean(
                        Label.ASK_SUBSCRIBE_PRODUCT_NOTIFICATIONS
                );

        ui.lerInput(
                input
        );

        return input.getValor();
    }
}