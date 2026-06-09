package atec.poo.escola.core.professores;


import java.time.LocalDate;
import java.time.Period;

import atec.poo.escola.core.School;

public class Professor implements Comparable<Professor> {

    private int id;
    private String nome;
    private LocalDate dataNsacimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNsacimento() {
        return dataNsacimento;
    }

    public void setDataNsacimento(LocalDate dataNsacimento) {
        this.dataNsacimento = dataNsacimento;
    }

    public Professor(int id, String nome, LocalDate dataNsacimento) {
        this.id = id;
        this.nome = nome;
        this.dataNsacimento = dataNsacimento;
    }

    private int getIdadeprofessor() {

        return Period.between(this.dataNsacimento, School.today).getYears();

    }


    @Override
    public String toString() {
        return String.format("[%d] %s - %d anos", this.id, this.nome, this.getIdadeprofessor());
    }

    @Override
    public int compareTo(Professor a) {
        if (this.nome.equals(a.getNome()))
            return a.getId() - this.id;
        return this.nome.compareTo(a.getNome());
    }

    public String professorDetails() {
        return String.format("Nome: %s\n" +
                "Data de nascimento: %s\n" +
                "Idade: %d\n", this.nome, this.dataNsacimento.toString(), this.getIdadeprofessor());
    }
}
