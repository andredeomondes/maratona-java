package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class Exercicio {
    public static void main(String[] args) {
        // Crie uma classe Carro com os atributos modelo, fabricante e ano
        // Crie 2 objetos dessa classe e atribua valores aos atributos
        // Imprima os valores dos atributos de cada objeto

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("---------------- Exercicio ----------------");
        carro1.modelo = "Gol";
        carro1.fabricante = "Volkswagen";
        carro1.ano = 2020;

        carro2.modelo = "Onix";
        carro2.fabricante = "Chevrolet";
        carro2.ano = 2021;

        System.out.println("Dados do carro 1:");
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Fabricante: " + carro1.fabricante);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("-------------------");
        System.out.println("Dados do carro 2:");
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Fabricante: " + carro2.fabricante);
        System.out.println("Ano: " + carro2.ano);




    }
}

