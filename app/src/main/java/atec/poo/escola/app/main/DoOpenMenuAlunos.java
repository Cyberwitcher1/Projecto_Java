package atec.poo.escola.app.main;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por abrir o menu de alunos.
 */
public class DoOpenMenuAlunos extends Comando<SchoolManager> {

    public DoOpenMenuAlunos(SchoolManager schoolManager) {
        super(schoolManager, Label.OPEN_MENU_ALUNOS);
    }

    @Override
    public void executar() throws DialogException {
        //System.out.println("Um dois tres");
        new atec.poo.escola.app.alunos.Menu(
                getReceptor()
        ).open();
    }
}