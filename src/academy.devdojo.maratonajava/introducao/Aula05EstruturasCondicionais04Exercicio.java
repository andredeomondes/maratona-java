public class Aula05EstruturasCondicionais04Exercicio {
    /**
     * <h1>Estruturas condicionais</h1>
     * <p>
     * Estruturas condicionais servem para tomar decisões no código baseado em condições.
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {

        double salarioAnual=70000;
        double primeiraFaixa=9.70/100;
        double segundaFaixa=37.35/100;
        double terceiraFaixa=49.50/100;

        double valorImposto=0;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("O valor do imposto é " + valorImposto);



    }
}