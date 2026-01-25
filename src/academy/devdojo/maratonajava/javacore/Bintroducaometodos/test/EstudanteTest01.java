package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Naruto";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        System.out.println("Dados do estudante 01:");
        estudante01.imprimeEstudante();
        System.out.println("-------------------");
        System.out.println("Dados do estudante 02:");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);



    }
}
