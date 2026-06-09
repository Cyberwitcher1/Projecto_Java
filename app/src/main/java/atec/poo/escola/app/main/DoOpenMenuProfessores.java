package atec.poo.escola.app.main;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por abrir o menu de professores.
 */
public class DoOpenMenuProfessores extends Comando<SchoolManager> {

    public DoOpenMenuProfessores(SchoolManager schoolManager) {
        super(schoolManager, Label.OPEN_MENU_PROFESSORES);
    }

    @Override
    public void executar() throws DialogException {
        new atec.poo.escola.app.professores.Menu(
                getReceptor()
        ).open();
    }
}