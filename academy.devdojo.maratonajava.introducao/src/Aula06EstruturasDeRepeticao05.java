public class Aula06EstruturasDeRepeticao05 {
    /**
     * <h1>Estruturas de repetição</h1>
     * <p>
     * Estruturas de repetição servem para repetir blocos de código enquanto uma condição for verdadeira.
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valor da parcela >= 1000 reais
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela>=1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela<1000){
                continue;
            }
            System.out.printf("Parcela %d: R$ %.2f %n", parcela, valorParcela);
        }

    }

}
