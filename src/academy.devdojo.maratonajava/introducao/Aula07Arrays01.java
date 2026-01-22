public class Aula07Arrays01 {
    /**
     * * <h1>Arrays (Vetores)</h1>
     * <p>
     * Arrays são estruturas de dados que armazenam uma coleção fixa de valores do mesmo tipo.
     * Eles são usados para armazenar múltiplos valores em uma única variável, facilitando o gerenciamento e o acesso aos dados.
     * </p>
     */
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 22;
        idades[2] = 23;

        System.out.println("Idade 1: " + idades[0]);
        System.out.println("Idade 2: " + idades[1]);
        System.out.println("Idade 3: " + idades[2]);

    }
}
