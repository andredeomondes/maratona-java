public class Aula02TiposPrimitivos {
    /**
     * <h1>Tipos primitivos</h1>
     *
     */

    public static void main(String[] args) {
        // int, double , float , chat, byte , short, long , boolean
        int idade = (int) 10000000000000L; // 4 bytes
        double salarioDouble = 2000; // 8 bytes
        float salarioFloat = (float) 2500.80; // 8 bytes
        long numeroGrande = (long) 1000.45;
        byte idadeByte = -128; // 1 byte
        short idadeShort = 10; // 2 bytes
        boolean verdadeiro = true; // 1 bit
        boolean falso = false; // 1 bit
        char caractere = 87; // 2 bytes
        String nome = "Um grande texto";

        System.out.println("A idade é " + idade);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(salarioFloat);

    }
}
