package atec.poo.loja.app.clients;

import atec.poo.ui.*;
import atec.poo.ui.exceptions.DialogException;

import java.time.LocalDate;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por solicitar ao utilizador os valores
 * necessários às operações relacionadas com clientes.
 *
 * <p>Todos os inputs são lidos através da instância comum
 * {@link Dialogo#IO}. Desta forma, a aplicação pode receber dados a partir
 * da consola ou de uma fonte de input configurada para testes automáticos.</p>
 *
 * <p>Esta classe esconde os detalhes da framework de UI. Os comandos recebem
 * diretamente valores Java, sem terem de manipular objetos do tipo
 * {@link LerString}, {@link LerInteiro} ou {@link LerData}.</p>
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
     * Solicita o nome de um cliente.
     *
     * @return nome introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static String clientName()
            throws DialogException {

        LerString input = new LerString(
                Label.ASK_CLIENT_NAME,
                null
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o NIF de um cliente.
     *
     * <p>O NIF deverá ser constituído por exatamente nove algarismos.</p>
     *
     * @return NIF introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static String clientNif()
            throws DialogException {

        LerString input = new LerString(
                Label.ASK_CLIENT_NIF,
                Constantes.NIF_REGEX
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita a data de nascimento de um cliente.
     *
     * @return data de nascimento introduzida
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static LocalDate clientBirthDate()
            throws DialogException {

        LerData input = new LerData(
                Label.ASK_CLIENT_BIRTH_DATE
        );

        ui.lerInput(input);

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

        LerInteiro input = new LerInteiro(
                Label.ASK_CLIENT_ID
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o novo nome de um cliente.
     *
     * @return novo nome introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static String newClientName()
            throws DialogException {

        LerString input = new LerString(
                Label.ASK_NEW_CLIENT_NAME,
                null
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o termo utilizado para pesquisar clientes pelo nome.
     *
     * @return termo de pesquisa introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static String searchTerm()
            throws DialogException {

        LerString input = new LerString(
                Label.ASK_SEARCH_TERM,
                null
        );

        ui.lerInput(input);

        return input.getValor();
    }
}