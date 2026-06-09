package atec.poo.escola.app.main;

import atec.poo.escola.core.SchoolManager;
import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;

/**
 * Comando responsável por apresentar um resumo da escola.
 */
public class DoShowSchoolSummary extends Comando<SchoolManager> {

    public DoShowSchoolSummary(SchoolManager schoolManager) {
        super(schoolManager, Label.SHOW_SCHOOL_SUMMARY);
    }

    @Override
    public void executar() throws DialogException {
        //TODO - A implementar pelo alunos
    }
}