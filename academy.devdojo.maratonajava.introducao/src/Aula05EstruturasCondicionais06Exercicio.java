public class Aula05EstruturasCondicionais06Exercicio {
    /**
     * <h1>Estruturas condicionais</h1>
     * <p>
     * Estruturas condicionais servem para tomar decisões no código baseado em condições.
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {

        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        // Considerando 1 como domingo.

        int dia = 7;
        switch(dia) {
            case 1: // domingo
            case 7: // sábado
                System.out.println("Final de semana");
                break;
            case 2: // segunda
            case 3: // terça
            case 4: // quarta
            case 5: // quinta
            case 6: // sexta
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }


    }
}