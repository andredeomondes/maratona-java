public class Aula05EstruturasCondicionais01 {
    /**
     * <h1>Estruturas condicionais</h1>
     * <p>
     * Estruturas condicionais servem para tomar decisões no código baseado em condições.
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // Estrutura condicional simples
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");

    }
}