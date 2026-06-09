package atec.poo.escola.app.turmas;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;

/**
 * Menu responsável pelas operações relacionadas com turmas.
 */
public class Menu extends atec.poo.ui.Menu {

    /**
     * Cria o menu de gestão de turmas.
     *
     * @param schoolManager gestor da escola partilhado pelos comandos
     */
    public Menu(SchoolManager schoolManager) {
        super(
                Label.TITLE,
                new Comando<?>[]{
                        new DoCriarTurma(schoolManager),
                        new DoAdicionarAlunoTurma(schoolManager),
                        new DoListarTurmas(schoolManager),
                        new DoMostrarTurma(schoolManager)
                }
        );
    }
}