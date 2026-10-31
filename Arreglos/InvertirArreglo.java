/**
*Arreglos Invertir Arreglo
*author Uriel Ramírez
*@date 30 octubre 2026
*/

public class InvertirArreglo {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Arreglo normal:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nArreglo invertido:");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}