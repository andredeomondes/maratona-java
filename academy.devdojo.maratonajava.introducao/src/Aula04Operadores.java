public class Aula04Operadores {
    /**
     * <h1>Operadores</h1>
     *
     */
    public static void main(String[] args) {


        int numero01 = 10;
        int numero02 = 20;


        // Aritméticos---------------------------------------------------
        System.out.println("soma: " + (numero01 + numero02));
        System.out.println("subtração: " + (numero01 - numero02));
        System.out.println("multiplicação: " + (numero01 * numero02));
        System.out.println("divisão: " + (numero01 / (double) numero02));
        // O operador módulo retorna o resto da divisão
        System.out.println("módulo: " + (numero01 % numero02));

        //---------------------------------------------------------------
        boolean isDezMaiorQueVinte = 10 > 20; // Operador maior que
        boolean isDezMenorQueVinte = 10 < 20; // Operador menor que
        boolean isDezIgualAVinte = 10 == 20; // Operador igual a
        boolean isDezDiferenteDeVinte = 10 != 20; // Operador diferente de

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte: " + isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte: " + isDezDiferenteDeVinte);

        //---------------------------------------------------------------



    }
}
