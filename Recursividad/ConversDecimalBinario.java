/**
*Recursividad Conversion de decimal a Binario
*author Uriel Ramírez
*@date 30 octubre 2026
*/

public class ConversDecimalBinario {

    public static String convertir(int numero) {

        if (numero < 2) {
            return String.valueOf(numero);
        }

        return convertir(numero / 2) + (numero % 2);
    }

    public static void main(String[] args) {

        int numero = 13;

        System.out.println("Numero decimal: " + numero);
        System.out.println("Numero binario: " + convertir(numero));

    }
}