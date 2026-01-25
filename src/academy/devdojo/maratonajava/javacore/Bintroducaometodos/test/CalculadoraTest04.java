package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 5;
        int num2 = 3;
        calculadora.alteraDoisNumeros(5, 3);
        System.out.println("---------------------");
        System.out.println("Dentro do main após alteração:");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }

}
