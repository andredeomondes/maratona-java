public class Aula05EstruturasCondicionais03 {
    /**
     * <h1>Estruturas condicionais</h1>
     * <p>
     * Estruturas condicionais servem para tomar decisões no código baseado em condições.
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {
        // Doar se salario for maior que 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições de doar";
        // TERNÁRIO (condição) ? verdadeiro : falso
        String resultado = salario >5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);



    }
}