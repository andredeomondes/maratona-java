/**
Prática
Crie variáveis para os campos descritos abaixo entre <> = imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que reebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "João Silva";
        String endereco = "Rua das Flores, 123, São Paulo, SP";
        double salario = 3500.75;
        String data = "15/06/2024";

        System.out.printf("Eu %s, morando no endereço %s,%nconfirmo que recebi o salário de R$ %.2f, na data %s.%n",
                nome, endereco, salario, data);

    }
}

