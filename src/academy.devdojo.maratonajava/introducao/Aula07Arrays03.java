public class Aula07Arrays03 {
    /**
     * * <h1>Arrays (Vetores)</h1>
     * <p>
     * Arrays são estruturas de dados que armazenam uma coleção fixa de valores do mesmo tipo.
     * Eles são usados para armazenar múltiplos valores em uma única variável, facilitando o gerenciamento e o acesso aos dados.
     * </p>
     */
    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "DevDojo";
        nomes[1] = "Academy";
        nomes[2] = "Java";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }

    }
}
