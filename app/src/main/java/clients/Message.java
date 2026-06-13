package atec.poo.loja.app.clients;

import atec.poo.ui.Dialogo;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por apresentar as mensagens associadas
 * às operações de gestão de clientes.
 *
 * <p>Todos os outputs são enviados através da instância comum
 * {@link Dialogo#IO}. Desta forma, a aplicação pode apresentar os
 * resultados na consola ou redirecioná-los para um ficheiro de output,
 * facilitando a realização de testes automáticos.</p>
 *
 * <p>Esta classe não deve ser instanciada. Todos os seus métodos são
 * estáticos.</p>
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
     * Apresenta uma mensagem a indicar que um cliente foi registado
     * com sucesso.
     *
     * @param clientId identificador atribuído ao cliente
     */
    public static void clientRegistered(int clientId) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENT_REGISTERED_SUCCESS,
                        clientId
                )
        );
    }

    /**
     * Apresenta os dados detalhados de um cliente.
     *
     * @param clientId  identificador do cliente
     * @param name      nome do cliente
     * @param nif       NIF do cliente
     * @param birthDate data de nascimento do cliente
     * @param age       idade atual do cliente
     * @param status    status atual do cliente
     */
    public static void clientDetails(
            int clientId,
            String name,
            String nif,
            String birthDate,
            int age,
            String status
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENT_DETAILS,
                        clientId,
                        name,
                        nif,
                        birthDate,
                        age,
                        status
                )
        );
    }

    /**
     * Apresenta o cabeçalho da lista de clientes.
     *
     * @param numberOfClients número de clientes apresentados
     */
    public static void clientsListHeader(
            int numberOfClients
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENTS_LIST_HEADER,
                        numberOfClients
                )
        );
    }

    /**
     * Apresenta um cliente numa lista.
     *
     * @param clientId identificador do cliente
     * @param name     nome do cliente
     * @param nif      NIF do cliente
     */
    public static void clientsListItem(
            int clientId,
            String name,
            String nif
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENTS_LIST_ITEM,
                        clientId,
                        name,
                        nif
                )
        );
    }

    /**
     * Apresenta o cabeçalho da lista de clientes ordenados por idade.
     *
     * @param numberOfClients número de clientes apresentados
     */
    public static void clientsByAgeListHeader(
            int numberOfClients
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENTS_BY_AGE_LIST_HEADER,
                        numberOfClients
                )
        );
    }

    /**
     * Apresenta um cliente na lista ordenada por idade.
     *
     * @param clientId identificador do cliente
     * @param name     nome do cliente
     * @param age      idade atual do cliente
     * @param status   status atual do cliente
     */
    public static void clientsByAgeListItem(
            int clientId,
            String name,
            int age,
            String status
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENTS_BY_AGE_LIST_ITEM,
                        clientId,
                        name,
                        age,
                        status
                )
        );
    }

    /**
     * Apresenta uma mensagem a indicar que o nome do cliente foi alterado.
     *
     * @param clientId identificador do cliente
     * @param oldName nome anterior do cliente
     * @param newName novo nome do cliente
     */
    public static void clientNameChanged(
            int clientId,
            String oldName,
            String newName
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENT_NAME_CHANGED_SUCCESS,
                        clientId,
                        oldName,
                        newName
                )
        );
    }

    /**
     * Apresenta o cabeçalho dos resultados da pesquisa.
     *
     * @param numberOfClients número de clientes encontrados
     */
    public static void clientSearchHeader(
            int numberOfClients
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENT_SEARCH_HEADER,
                        numberOfClients
                )
        );
    }

    /**
     * Apresenta um cliente encontrado na pesquisa.
     *
     * @param clientId identificador do cliente
     * @param name nome do cliente
     * @param nif NIF do cliente
     * @param status status atual do cliente
     */
    public static void clientSearchItem(
            int clientId,
            String name,
            String nif,
            String status
    ) {
        ui.escreveLinha(
                String.format(
                        Label.CLIENT_SEARCH_ITEM,
                        clientId,
                        name,
                        nif,
                        status
                )
        );
    }
}