public class Aula06EstruturasDeRepeticao01 {
    /**
     * <h1>Estruturas de repetição</h1>
     * <p>
     * Estruturas de repetição servem para repetir blocos de código enquanto uma condição for verdadeira.
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {
        // While, do-while, for

        // While --------------------------------------------
        int count = 0;
        while (count < 10) {
            System.out.println("While " + count);
            count++;
        }

        // Do-While ----------------------------------------
        do {
            System.out.println("Do-While " + count);
            count++;
        } while (count < 20);


        // For ---------------------------------------------
        for (int i = 20; i < 30; i++) {
            System.out.println("For " + i);
        }

    }

}
