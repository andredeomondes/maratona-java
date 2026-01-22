import java.sql.SQLOutput;

public class Aula04Operadores {
    /**
     * <h1>Operadores</h1>
     *
     */
    public static void main(String[] args) {


        int numero01 = 10;
        int numero02 = 20;


        // Aritméticos ---------------------------------------------------
        System.out.println("----- Operadores Aritméticos -----");
        System.out.println("soma: " + (numero01 + numero02));
        System.out.println("subtração: " + (numero01 - numero02));
        System.out.println("multiplicação: " + (numero01 * numero02));
        System.out.println("divisão: " + (numero01 / (double) numero02));
        // O operador módulo retorna o resto da divisão
        System.out.println("módulo: " + (numero01 % numero02));

        // Relacionais ---------------------------------------------------------------
        System.out.println("\n----- Operadores Relacionais -----");
        boolean isDezMaiorQueVinte = 10 > 20; // Operador maior que
        boolean isDezMenorQueVinte = 10 < 20; // Operador menor que
        boolean isDezIgualAVinte = 10 == 20; // Operador igual a
        boolean isDezDiferenteDeVinte = 10 != 20; // Operador diferente de

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte: " + isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte: " + isDezDiferenteDeVinte);

        // Operadores lógicos (AND, OR, NOT) --------------------------------
        int idade = 35;
        float salario = 3500F;

        // Operador AND &&
        System.out.println("\n----- Operador AND -----");
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612; // AND
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381; // AND
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        // Operador OR ||
        System.out.println("\n----- Operador OR -----");
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCompravel: " + isPlaystationCompravel);

        // Operador = += -= *= /= %=
        System.out.println("\n----- Operadores de Atribuição -----");
        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000
        bonus -= 1000; // bonus = bonus - 1000
        bonus *= 2;    // bonus = bonus * 2
        bonus /= 2;    // bonus = bonus / 2
        bonus %= 2;    // bonus = bonus % 2
        System.out.println("Valor do bônus: " + bonus);

        // Operador Unário ++ --
        int contador = 0;
        contador +=1; // contador = contador + 1 incremento normal
        contador++; // contador = contador + 1 incremento depois da variável
        contador--; // contador = contador - 1 incremento depois da variável
        ++contador; // contador = contador + 1 incremento antes da variável
        --contador; // contador = contador - 1 decremento antes da variável
        System.out.println("Contador: " + contador);

    }
}
