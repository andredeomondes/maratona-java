public class Aula06EstruturasDeRepeticao02Exercicio {
    /**
     * <h1>Estruturas de repetição</h1>
     * <p>
     * Estruturas de repetição servem para repetir blocos de código enquanto uma condição for verdadeira.
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {
        // Imprima os números pares de 0 a 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
