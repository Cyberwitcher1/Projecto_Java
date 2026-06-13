package atec.poo.loja.app.notifications;

import atec.poo.ui.Dialogo;
import atec.poo.ui.LerBoolean;
import atec.poo.ui.LerInteiro;
import atec.poo.ui.exceptions.DialogException;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por solicitar ao utilizador os valores
 * necessários às operações relacionadas com notificações.
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
     * Pergunta se o cliente pretende cancelar todas
     * as respetivas subscrições ativas.
     *
     * @return {@code true} se o cliente responder afirmativamente
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static boolean cancelActiveSubscriptions()
            throws DialogException {

        LerBoolean input =
                new LerBoolean(
                        Label.ASK_CANCEL_ACTIVE_SUBSCRIPTIONS
                );

        ui.lerInput(
                input
        );

        return input.getValor();
    }
}