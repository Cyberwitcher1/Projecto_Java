package atec.poo.loja.app.clients;

import atec.poo.loja.app.exceptions.AppInvalidClientAgeException;
import atec.poo.loja.core.StoreManager;
import atec.poo.loja.core.exceptions.InvalidClientException;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

import java.time.LocalDate;

/**
 * Comando responsável por registar um novo cliente.
 */
public class DoRegisterClient extends Comando<StoreManager> {

    /**
     * Cria o comando responsável por registar um cliente.
     *
     * @param storeManager gestor da loja
     */
    public DoRegisterClient(StoreManager storeManager) {
        super(storeManager, Label.REGISTER_CLIENT);
    }

    /**
     * Regista um novo cliente.
     *
     * @throws DialogException se ocorrer um erro durante a interação
     */
    @Override
    public void executar() throws DialogException {

        //TODO: A implementar pelos alunos
        String name=Prompt.clientName();
        String nif=Prompt.clientNif();
        LocalDate birthDate=Prompt.clientBirthDate();
        int id= 0;
        try {
            id = this.getReceptor().registClient(name,nif,birthDate);
            Message.clientRegistered(id);
        } catch (InvalidClientException e) {
            throw new AppInvalidClientAgeException(e.getBirthDate());
        }
    }
}