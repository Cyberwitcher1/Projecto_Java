package atec.poo.escola.app.alunos;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;

/**
 * Menu responsável pelas operações relacionadas com alunos.
 */
public class Menu extends atec.poo.ui.Menu {

    /**
     * Cria o menu de gestão de alunos.
     *
     * @param schoolManager gestor da escola partilhado pelos comandos
     */
    public Menu(SchoolManager schoolManager) {
        super(
                Label.TITLE,
                new Comando<?>[]{
                        new DoCreateStudent(schoolManager),
                        new DoListStudents(schoolManager),
                        new DoListStudentsByAge(schoolManager),
                        new DoShowStudent(schoolManager)
                }
        );
    }
}