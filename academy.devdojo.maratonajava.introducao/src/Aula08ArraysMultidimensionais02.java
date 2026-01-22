public class Aula08ArraysMultidimensionais02 {
    /**
     * <h1>Arrays Multidimensionais</h1>
     * <p>
     * Arrays multidimensionais são estruturas de dados que armazenam coleções de valores em mais de uma dimensão.
     * Eles são usados para representar tabelas, matrizes ou qualquer outra estrutura que exija múltiplas dimensões.
     * </p>
     * @param args
     */
    public static void main(String[] args) {
        // Meses do ano x 12
        // Dias do mês y  28 a 31

        // 3 linhas e 4 colunas = 12
        int[][] dias = new int[3][4];

        // Inicializando o array multidimensional com os dias de cada mês
        dias[0][0] = 31; // Janeiro
        dias[0][1] = 28; // Fevereiro
        dias[0][2] = 31; // Março
        dias[0][3] = 30; // Abril

        // Segunda linha
        dias[1][0] = 31; // Maio
        dias[1][1] = 30; // Junho
        dias[1][2] = 31; // Julho
        dias[1][3] = 31; // Agosto

        dias[2][0] = 30; // Setembro
        dias[2][1] = 31; // Outubro
        dias[2][2] = 30; // Novembro
        dias[2][3] = 31; // Dezembro


        // Imprimindo os dias de cada mês
        System.out.println("Dias de cada mês:");
      for(int[]d : dias){
          for(int diaDoMes : d){
              System.out.printf(" %d ", diaDoMes);
          }
          System.out.println();
      }


    }
}
