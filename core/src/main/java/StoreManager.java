package atec.poo.loja.core;

import atec.poo.loja.core.exceptions.InvalidClientException;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import java.util.Scanner;

public class StoreManager {
    private Store store;

    public StoreManager() {
        this.store = new Store();
    }

    /**
     * Devolve a data simulada atual da aplicação.
     *
     * @return data atual da loja
     */
    public LocalDate getToday() {
        return this.store.getToday();
    }

    /**
     * Avança a data simulada da aplicação.
     *
     * @param numberOfDays número de dias a avançar
     * @return {@code true} se a data tiver sido avançada;
     * {@code false} se o número de dias não for válido
     */
    public boolean advanceDate(int numberOfDays) {
        return this.store.advanceDate(numberOfDays);
    }

    public void importFile(String dataFile) throws IOException {
        Scanner ler = new Scanner(new File(dataFile));
        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            //Ignorar linha de comentários (#) no ficheiro
            if (linha.startsWith("#")) continue;
            String[] elements = linha.split("\\|");
            switch (elements[0]) {
                case "CLIENT":
                    //TODO
                    break;

                case "PRODUCT":
                    //TODO
                    break;
            }
        }
    }

    //TODO: A completar pelos alunos

    public int registClient(String name, String nif, LocalDate birthDate) throws InvalidClientException {
        return this.store.registClient(name, nif, birthDate);
    }


}
