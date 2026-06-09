package atec.poo.escola.core;

import atec.poo.escola.core.alunos.Aluno;
import atec.poo.escola.core.professores.Professor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class School {
    /**
     * Data inicial da aplicação.
     *
     * <p>A aplicação inicia sempre nesta data para permitir que os resultados
     * sejam previsíveis e facilmente testáveis. NÃO ALTERAR</p>
     */
    public static final LocalDate today =
            LocalDate.of(2026, 6, 1);

    private HashMap<Integer, Aluno> alunos;
    private HashMap<Integer, Professor> professor;
    private int nextAluno;
    private int nextProfessor;

    //Declarar hashmap e contador professores

    public School() {
        this.alunos=new HashMap<>();
        this.professor= new HashMap<>();
        this.nextAluno=1;
        this.nextProfessor=1;
        //inicializar professores
    }

    public int registStudent(String nome, LocalDate dataNascimento){
        Aluno a=new Aluno(this.nextAluno,nome,dataNascimento);
        this.nextAluno ++;
        this.alunos.put(a.getId(),a);
        return a.getId();
    }

    public int registProfessor(String nome, LocalDate dataNascimento){
        Professor a=new Professor(this.nextProfessor, nome, dataNascimento);
        this.nextProfessor ++;
        this.professor.put(a.getId(), a);
        return a.getId();
    }

    public ArrayList<String> listaAlunosNome(){
        ArrayList<Aluno> alunosOrdenados=new ArrayList<>(this.alunos.values());
        Collections.sort(alunosOrdenados);
        ArrayList<String> frases=new ArrayList<>();
        for (Aluno a: alunosOrdenados){
            frases.add(a.toString());
        }
        return frases;
    }

    public Aluno getStudentdetails(int id){
        if(!this.alunos.containsKey(id))
            return null;
        return this.alunos.get(id);
    }
}
