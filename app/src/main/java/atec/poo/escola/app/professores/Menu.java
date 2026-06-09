package atec.poo.escola.app.professores;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;

/**
 * Menu responsável pelas operações relacionadas com professores.
 */
public class Menu extends atec.poo.ui.Menu {

    /**
     * Cria o menu de gestão de professores.
     *
     * @param schoolManager gestor da escola partilhado pelos comandos
     */
    public Menu(SchoolManager schoolManager) {
        super(
                Label.TITLE,
                new Comando<?>[]{
                        new DoAdicionarProfessor(schoolManager),
                        new DoListarProfessoresIdade(schoolManager),
                        new DoListarProfessoresNome(schoolManager),
                        new DoMostrarProfessor(schoolManager)
                }
        );
    }
}