package atec.poo.escola.app.main;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por abrir o menu de turmas.
 */
public class DoOpenMenuTurmas extends Comando<SchoolManager> {

    public DoOpenMenuTurmas(SchoolManager schoolManager) {
        super(schoolManager, Label.OPEN_MENU_TURMAS);
    }

    @Override
    public void executar() throws DialogException {
        new atec.poo.escola.app.turmas.Menu(
                getReceptor()
        ).open();
    }
}