public class Aula07Arrays04 {
    /**
     * * <h1>Arrays (Vetores)</h1>
     * <p>
     * Arrays são estruturas de dados que armazenam uma coleção fixa de valores do mesmo tipo.
     * Eles são usados para armazenar múltiplos valores em uma única variável, facilitando o gerenciamento e o acesso aos dados.
     * </p>
     */
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int[] numeros3 = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for(int num: numeros){
            System.out.println(num);
        }

        for(int num: numeros2){
            System.out.println(num);
        }

        for(int num: numeros3){
            System.out.println(num);
        }


    }
}
