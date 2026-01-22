public class Aula08ArraysMultidimensionais03 {
    /**
     * <h1>Arrays Multidimensionais</h1>
     * <p>
     * Arrays multidimensionais são estruturas de dados que armazenam coleções de valores em mais de uma dimensão.
     * Eles são usados para representar tabelas, matrizes ou qualquer outra estrutura que exija múltiplas dimensões.
     * </p>
     * @param args
     */
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3,4,5};
        arrayInt[2] = new int[]{6,7,8,9,10,11,12,13,14,15};


        for(int[] arrayBase : arrayInt){
            System.out.println("\n-----------");
                for (int num : arrayBase){
                    System.out.print(num);
            }
        }
        System.out.println("\n-----------");


    }
}
