package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Sanji";



        System.out.println("Dados do estudante 01:");
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println("Referência" + estudante);
        System.out.println("-------------------");
        System.out.println("Dados do estudante 02:");
        System.out.println("Nome: " + estudante2.nome);
        System.out.println("Idade: " + estudante2.idade);
        System.out.println("Sexo: " + estudante2.sexo);
        System.out.println("Referência" + estudante2);


    }
}
