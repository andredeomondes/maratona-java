public class Aula05EstruturasCondicionais05 {
    /**
     * <h1>Estruturas condicionais</h1>
     * <p>
     * Estruturas condicionais servem para tomar decisões no código baseado em condições.
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {

        byte dia =5;
        switch (dia){
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Sexo inválido");
                break;
        }


    }
}