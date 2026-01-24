package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kakashi";
        professor.idade = 32;
        professor.sexo = 'M';

        System.out.println("Dados do professor:");
        System.out.println("Nome: " + professor.nome);
        System.out.println("Idade: " + professor.idade);
        System.out.println("Sexo: " + professor.sexo);



    }
}