public class Aula07Arrays02 {
    /**
     * * <h1>Arrays (Vetores)</h1>
     * <p>
     * Arrays são estruturas de dados que armazenam uma coleção fixa de valores do mesmo tipo.
     * Eles são usados para armazenar múltiplos valores em uma única variável, facilitando o gerenciamento e o acesso aos dados.
     * </p>
     */
    public static void main(String[] args) {
        // byte, short, int, long, float, double 0
        // char '\u0000'
        // boolean false
        // String reference types null

        // Armazenam valores padrões do tipo de dado de acordo com o tamanho do array criado na memória heap

        String [] nomes = new String[3];
        nomes[0] = "DevDojo";
        nomes[1] = "Academy";
        nomes[2] = "Java";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 22;
        idades[2] = 23;
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        double [] salarios = new double[3];
        salarios[0] = 1500.50;
        salarios[1] = 2500.75;
        salarios[2] = 3500.00;
        for (int i = 0; i < salarios.length; i++) {
            System.out.println(salarios[i]);
        }

        float [] alturas = new float[3];
        alturas[0] = 1.75f;
        alturas[1] = 1.80f;
        alturas[2] = 1.65f;
        for (int i = 0; i < alturas.length; i++) {
            System.out.println(alturas[i]);

        }



    }
}
