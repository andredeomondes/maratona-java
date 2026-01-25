package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {
        // Crie uma classe Funcionario com os seguintes atributos
        // nome
        // idade
        // salario // 3 salarios devem ser guardados

        // Crie dois metodos
        // imprimir - deve imprimir todos os dados do funcionario
        // calcularMediaSalario - deve calcular e retornar a media salarial do funcionario


        Locale.setDefault(Locale.US);

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Pedro";
        funcionario.idade = 28;
        funcionario.salario = new double[]{2500, 3000, 2800};
        funcionario.imprimirDados(funcionario.nome, funcionario.idade, funcionario.salario);
        double media = funcionario.calcularMediaSalario();


    }
}
