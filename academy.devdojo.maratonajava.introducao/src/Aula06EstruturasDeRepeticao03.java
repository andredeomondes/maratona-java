public class Aula06EstruturasDeRepeticao03 {
    /**
     * <h1>Estruturas de repetição</h1>
     * <p>
     * Estruturas de repetição servem para repetir blocos de código enquanto uma condição for verdadeira.
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {
        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }

    }

}
