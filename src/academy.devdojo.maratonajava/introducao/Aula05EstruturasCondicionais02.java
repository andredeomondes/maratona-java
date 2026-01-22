public class Aula05EstruturasCondicionais02 {
    /**
     * <h1>Estruturas condicionais</h1>
     * <p>
     * Estruturas condicionais servem para tomar decisões no código baseado em condições.
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {

        // idade <15 categoria infantil
        // idade >=15 && idade <18 categoria juvenil
        // idade >=18 categoria adulto

        int idade = 17;
        String categoria = "Nada";
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";

        }

        System.out.println(categoria);


    }
}