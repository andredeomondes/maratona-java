public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = (int) 10000000000000L; // 4 bte
        double salarioDouble = 2000; // 8 bytes
        float salarioFloat = 2500.0f; //
        byte idadeByte = -128; // 1 byte
        short idadeShort = 10; // 2 bytes
        boolean verdadeiro = true; // 1 bit
        boolean falso = false; // 1 bit
        long numeroGrande = 100000L;
        char caractere = 87; // 2 bytes
        System.out.println("A idade é " + idade);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);

    }
}
