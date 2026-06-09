package atec.poo.escola.core.alunos;


import java.time.LocalDate;
import java.time.Period;

import atec.poo.escola.core.School;

public class Aluno implements Comparable<Aluno> {

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

    public Aluno(int id, String nome, LocalDate dataNsacimento) {
        this.id = id;
        this.nome = nome;
        this.dataNsacimento = dataNsacimento;
    }

    private int getIdadealuno() {

        return Period.between(this.dataNsacimento, School.today).getYears();

    }


    @Override
    public String toString() {
        return String.format("[%d] %s - %d anos", this.id, this.nome, this.getIdadealuno());
    }

    @Override
    public int compareTo(Aluno a) {
        if (this.nome.equals(a.getNome()))
            return a.getId() - this.id;
        return this.nome.compareTo(a.getNome());
    }

    public String studentDetails() {
        return String.format("Nome: %s\n" +
                "Data de nascimento: %s\n" +
                "Idade: %d\n", this.nome, this.dataNsacimento.toString(), this.getIdadealuno());
    }
}
