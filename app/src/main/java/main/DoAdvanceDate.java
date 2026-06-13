package atec.poo.loja.app.main;

import atec.poo.loja.app.exceptions.AppInvalidNumberOfDaysException;
import atec.poo.loja.core.StoreManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.time.LocalDate;

/**
 * Comando responsável por avançar a data simulada da aplicação.
 *
 * <p>O utilizador deverá indicar o número de dias que pretende avançar.
 * O valor introduzido será enviado para o {@link StoreManager}, que deverá
 * validar a operação, atualizar a data atual e recalcular o status dos
 * clientes.</p>
 */
public class DoAdvanceDate extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por avançar a data da aplicação.
     *
     * @param storeManager gestor da loja utilizado para executar a operação
     */
    public DoAdvanceDate(StoreManager storeManager) {
        super(storeManager, Label.ADVANCE_DATE);
    }

    /**
     * Executa a operação de avanço da data simulada.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     *                         com o utilizador
     */
    @Override
    public void executar() throws DialogException {
        LocalDate today = this.getReceptor().getToday();

        int numberOfDays = Prompt.numberOfDays(today);

        if (!getReceptor().advanceDate(numberOfDays)) {
            throw new AppInvalidNumberOfDaysException(numberOfDays);
        }

        Message.dateAdvanced(
                getReceptor().getToday()
        );
    }
}