package atec.poo.loja.app.exceptions;

import java.time.LocalDate;

/**
 * Classe utilitária responsável pelas mensagens apresentadas pelas
 * exceções da aplicação.
 *
 * <p>As exceções que herdam de {@code DialogException} utilizam estes
 * métodos para construir as mensagens que serão automaticamente
 * apresentadas pela framework de UI.</p>
 */
public final class Label {

    public static String NO_SUCH_CLIENT =
            "Cliente com o id %d não existe.";

    public static String NO_CLIENTS_REGISTERED =
            "Não existem clientes registados na aplicação.";

    public static String NO_CLIENTS_FOUND =
            "Nenhum cliente encontrado com o critério \"%s\".";

    public static String INVALID_PRODUCT_PRICE =
            "O preço indicado [%.2f] não é válido. " +
                    "O preço do produto deve ser superior a zero.";

    public static String INVALID_PRODUCT_STOCK =
            "O stock inicial indicado [%d] não é válido. " +
                    "O stock inicial do produto não pode ser negativo.";

    public static String INVALID_WARRANTY_MONTHS =
            "O número de meses de garantia indicado [%d] não é válido. " +
                    "A garantia deve ser superior a zero meses.";

    public static String NO_SUCH_PRODUCT =
            "Produto com o id %d não existe.";

    public static String NO_PRODUCTS_REGISTERED =
            "Não existem produtos registados na aplicação.";

    public static String NO_PRODUCTS_IN_CATEGORY =
            "Não existem produtos registados na categoria selecionada [%d].";

    public static String NO_PRODUCTS_FOUND =
            "Não foram encontrados produtos para o termo de pesquisa [%s].";

    public static String INVALID_CATEGORY_PRICE_INCREASE =
            "A percentagem indicada [%.2f] não é válida. " +
                    "A percentagem de aumento deve ser superior a zero.";

    public static String INVALID_PRODUCT_STOCK_QUANTITY =
            "A quantidade indicada [%d] não é válida. " +
                    "A quantidade a adicionar deve ser superior a zero.";

    public static String INVALID_SALE_QUANTITY =
            "A quantidade indicada [%d] não é válida. " +
                    "A quantidade adquirida deve ser superior a zero.";

    public static String INSUFFICIENT_PRODUCT_STOCK =
            "Stock insuficiente para o produto [%d]. " +
                    "Quantidade solicitada: %d. Stock disponível: %d.";

    public static String PRODUCT_CANNOT_BE_SOLD =
            "O produto [%d] não pode ser vendido na data atual.";

    public static String NO_SUCH_SALE =
            "Venda com o id %d não existe.";

    public static String NO_SALES_REGISTERED =
            "Não existem vendas registadas na aplicação.";

    public static String NO_CLIENT_SALES =
            "O cliente [%d] %s ainda não efetuou vendas.";

    public static String NO_NOTIFICATIONS_REGISTERED =
            "Não existem notificações registadas na aplicação.";

    public static String NO_ACTIVE_SUBSCRIPTIONS =
            "Não existem subscrições ativas na aplicação.";

    public static String STATE_SAVE_ERROR =
            "Não foi possível guardar o estado da aplicação no ficheiro \"%s\".";

    public static String STATE_LOAD_ERROR =
            "Não foi possível abrir o estado da aplicação a partir do ficheiro \"%s\".";

    public static String ACTIVE_SUBSCRIPTION_ALREADY_EXISTS =
            "O cliente [%d] já possui uma subscrição ativa para o produto [%d].";

    /**
     * Impede a criação de instâncias desta classe utilitária.
     */
    private Label() {
    }

    /**
     * Devolve a mensagem apresentada quando o número de dias indicado
     * para avançar a data não é válido.
     *
     * @param numberOfDays número de dias introduzido pelo utilizador
     * @return mensagem de erro
     */
    public static String invalidNumberOfDays(int numberOfDays) {
        return String.format(
                "O número de dias indicado [%d] não é válido. "
                        + "O número de dias a avançar deve ser superior a zero.",
                numberOfDays
        );
    }

    /**
     * Devolve a mensagem apresentada quando se tenta registar
     * um cliente com menos de 18 anos.
     *
     * @param birthDate data de nascimento introduzida
     * @return mensagem de erro
     */
    public static String invalidClientAge(
            LocalDate birthDate
    ) {
        return String.format(
                "Não é possível registar o cliente com a data de nascimento [%s]. "
                        + "O cliente deverá possuir pelo menos 18 anos.",
                birthDate
        );
    }


}