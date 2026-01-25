package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;


    public void imprimirDados(String nome, int idade, double[] salario) {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        double soma = 0;
        for (double sal : this.salario) {
            soma += sal;
        }
        System.out.printf("Média salarial: %.2f", (soma / this.salario.length));
    }

    public double calcularMediaSalario() {
        double soma = 0;
        for (double sal : this.salario) {
            soma += sal;
        }
        return soma / this.salario.length;
    }


}

