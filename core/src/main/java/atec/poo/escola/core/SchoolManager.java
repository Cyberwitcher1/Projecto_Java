package atec.poo.escola.core;

import atec.poo.escola.core.alunos.Aluno;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolManager {

    private School school;



    public SchoolManager() {
        this.school = new School();
    }

    public void importFile(String dataFile) throws IOException {
        Scanner ler = new Scanner(new File(dataFile));
        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            //Ignorar linha de comentários (#) no ficheiro
            if (linha.startsWith("#")) continue;
            String[] elements = linha.split("\\|");
            switch (elements[0]) {
                case "STUDENT":
                    //TODO: invocar metodo de criação de STUDENT
                    this.registStudent(elements[1],LocalDate.parse(elements[2]));
                    break;

                case "TEACHER":
                    //TODO: invocar metodo de criação de STUDENT
                    break;
            }
        }
    }

    //TODO: completar pelos alunos

    public int registStudent(String nome, LocalDate dataNascimento){
        return this.school.registStudent(nome,dataNascimento);
    }

    public int registProfessor(String nome, LocalDate dataNascimento){
        return this.school.registProfessor(nome, dataNascimento);
    }

    public ArrayList<String> listaAlunosNome(){
        return this.school.listaAlunosNome();
    }

    public Aluno getStudentdetails(int id){
        return this.school.getStudentdetails(id);
    }

}