package atec.poo.loja.app.products;

import atec.poo.ui.Dialogo;
import atec.poo.ui.LerData;
import atec.poo.ui.LerDouble;
import atec.poo.ui.LerInteiro;
import atec.poo.ui.LerOpcao;
import atec.poo.ui.LerString;
import atec.poo.ui.exceptions.DialogException;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import static atec.poo.ui.Dialogo.IO;

/**
 * Classe utilitária responsável por solicitar ao utilizador os valores
 * necessários às operações relacionadas com produtos.
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
     * Solicita o identificador de um produto.
     *
     * @return identificador introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int productId()
            throws DialogException {

        LerInteiro input = new LerInteiro(
                Label.ASK_PRODUCT_ID
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o nome de um produto.
     *
     * @return nome introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static String productName()
            throws DialogException {

        LerString input = new LerString(
                Label.ASK_PRODUCT_NAME,
                null
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o preço inicial de um produto.
     *
     * @return preço introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static double productPrice()
            throws DialogException {

        LerDouble input = new LerDouble(
                Label.ASK_PRODUCT_PRICE
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o stock inicial de um produto.
     *
     * @return stock introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int initialStock()
            throws DialogException {

        LerInteiro input = new LerInteiro(
                Label.ASK_INITIAL_STOCK
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita a categoria de um produto.
     *
     * @return número correspondente à categoria selecionada
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int productCategory()
            throws DialogException {

        LinkedHashMap<Integer, String> options =
                new LinkedHashMap<>();

        options.put(
                1,
                "ALIMENTAÇÃO"
        );

        options.put(
                2,
                "ELETRÓNICA"
        );

        options.put(
                3,
                "VESTUÁRIO"
        );

        LerOpcao input = new LerOpcao(
                Label.ASK_PRODUCT_CATEGORY,
                options
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita a data de validade de um produto alimentar.
     *
     * @return data introduzida
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static LocalDate expirationDate()
            throws DialogException {

        LerData input = new LerData(
                Label.ASK_EXPIRATION_DATE
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o número de meses de garantia de um produto eletrónico.
     *
     * @return número de meses introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int warrantyMonths()
            throws DialogException {

        LerInteiro input = new LerInteiro(
                Label.ASK_WARRANTY_MONTHS
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita o tamanho de um produto de vestuário.
     *
     * @return tamanho selecionado
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static String clothingSize()
            throws DialogException {

        LinkedHashMap<Integer, String> options =
                new LinkedHashMap<>();

        options.put(
                1,
                "XS"
        );

        options.put(
                2,
                "S"
        );

        options.put(
                3,
                "M"
        );

        options.put(
                4,
                "L"
        );

        options.put(
                5,
                "XL"
        );

        LerOpcao input = new LerOpcao(
                Label.ASK_CLOTHING_SIZE,
                options
        );

        ui.lerInput(input);

        return input.getSelectedOptionName();
    }

    /**
     * Solicita um termo de pesquisa.
     *
     * @return termo introduzido
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

    /**
     * Solicita o novo preço de um produto.
     *
     * @return preço introduzido
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static double newProductPrice()
            throws DialogException {

        LerDouble input = new LerDouble(
                Label.ASK_NEW_PRODUCT_PRICE
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita a percentagem de aumento dos preços.
     *
     * @return percentagem introduzida
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static double percentageIncrease()
            throws DialogException {

        LerDouble input = new LerDouble(
                Label.ASK_PERCENTAGE_INCREASE
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Solicita a quantidade a adicionar ao stock atual.
     *
     * @return quantidade introduzida
     * @throws DialogException se ocorrer um erro durante a leitura
     */
    public static int stockQuantity()
            throws DialogException {

        LerInteiro input = new LerInteiro(
                Label.ASK_STOCK_QUANTITY
        );

        ui.lerInput(input);

        return input.getValor();
    }

    /**
     * Devolve o nome correspondente a uma opção de categoria.
     *
     * @param categoryOption opção selecionada
     * @return nome da categoria
     */
    public static String productCategoryName(
            int categoryOption
    ) {
        return switch (categoryOption) {
            case 1 -> "ALIMENTAÇÃO";
            case 2 -> "ELETRÓNICA";
            case 3 -> "VESTUÁRIO";
            default -> "";
        };
    }
}