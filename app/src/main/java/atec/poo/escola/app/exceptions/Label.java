package atec.poo.escola.app.exceptions;

/**
 * Mensagens apresentadas ao utilizador quando uma operação
 * não pode ser concluída.
 */
public interface Label {

    /*
     * Alunos
     */
    String STUDENT_NOT_FOUND =
            "Aluno com o ID %d não existe.";

    String NO_STUDENTS =
            "Não existem alunos registados na aplicação.";

    /*
     * Professores
     */
    String PROFESSOR_NOT_FOUND =
            "Professor com o número %d não existe.";

    String PROFESSOR_ALREADY_EXISTS =
            "Já existe um professor com o número %d.";

    String NO_PROFESSORS =
            "Não existem professores registados na aplicação.";

    /*
     * Turmas
     */
    String SCHOOL_CLASS_NOT_FOUND =
            "Turma com o código \"%s\" não existe.";

    String SCHOOL_CLASS_ALREADY_EXISTS =
            "Já existe uma turma com o código \"%s\".";

    String NO_SCHOOL_CLASSES =
            "Não existem turmas registadas na aplicação.";

    String STUDENT_ALREADY_IN_CLASS =
            "O aluno com o ID %d já pertence à turma \"%s\".";
}