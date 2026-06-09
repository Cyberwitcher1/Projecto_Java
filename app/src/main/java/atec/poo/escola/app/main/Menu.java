package atec.poo.escola.app.main;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;

/**
 * Menu principal da aplicação.
 *
 * Cada opção corresponde a uma classe responsável por executar
 * uma funcionalidade ou abrir um submenu.
 */
public class Menu extends atec.poo.ui.Menu {

    public Menu(SchoolManager schoolManager) {
        super(
                Label.TITLE,
                new Comando<?>[]{
                        new DoOpenMenuAlunos(schoolManager),
                        new DoOpenMenuProfessores(schoolManager),
                        new DoOpenMenuTurmas(schoolManager),
                        new DoShowSchoolSummary(schoolManager)
                }
        );
    }
}