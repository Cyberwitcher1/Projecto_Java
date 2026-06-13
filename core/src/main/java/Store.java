package atec.poo.loja.core;

import atec.poo.loja.core.clients.Client;
import atec.poo.loja.core.exceptions.InvalidClientException;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;


public class Store implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Data inicial da aplicação.
     *
     * <p>A aplicação inicia sempre nesta data para permitir que os resultados
     * sejam previsíveis e facilmente testáveis. NÃO ALTERAR</p>
     */
    private static final LocalDate INITIAL_DATE =
            LocalDate.of(2026, 6, 1);

    /**
     * Data simulada atual da loja.
     *
     * <p>Esta data faz parte do estado da aplicação e é guardada através
     * de serialização.</p>
     */
    private LocalDate today;

    //TODO: A IMPLEMENTAR. Restantes atributos da classe
    private int nextClientID;
    private HashMap<Integer, Client> clients;

    /**
     * Cria uma nova loja com a data inicial definida pela aplicação.
     */
    public Store() {
        this.today = INITIAL_DATE;
        //TODO: Completar pelos alunos
        this.nextClientID = 1;
        this.clients = new HashMap<>();

    }

    /**
     * Devolve a data simulada atual da aplicação.
     *
     * @return data atual da loja
     */
    public LocalDate getToday() {
        return this.today;
    }


    /**
     * Avança a data simulada da aplicação.
     *
     * <p>Depois de atualizar a data, recalcula o status
     * de todos os clientes.</p>
     *
     * @param numberOfDays número de dias a avançar
     * @return {@code true} se a data tiver sido avançada;
     *         {@code false} se o número de dias não for válido
     */
    public boolean advanceDate(
            int numberOfDays
    ) {
        if (numberOfDays <= 0) {
            return false;
        }

        this.today =
                this.today.plusDays(
                        numberOfDays
                );

        //TODO: Update User status after sales implemented

        return true;
    }

    //TODO: Completar restantes métodos
    public int registClient(String name, String nif, LocalDate birthDate) throws InvalidClientException {
        Client c=new Client(this.nextClientID, name, nif, birthDate);

        if(c.getAge(this.today) < 18){
            throw new InvalidClientException(birthDate);
            //Lançar uma exceção
        }
        //Se cheguei aqui
        this.clients.put(c.getId(), c);
        this.nextClientID++;
        return c.getId();
    }
}
