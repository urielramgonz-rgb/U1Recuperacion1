/**
*Recursividad Quitar duplicados
*author Uriel Ramírez
*@date 30 octubre 2026
*/

public class QuitarDuplicados {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 2, 3, 4, 4, 5};

        int[] resultado = new int[numeros.length];

        int contador = 0;

        System.out.println("Arreglo original:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        for (int i = 0; i < numeros.length; i++) {

            boolean repetido = false;

            for (int j = 0; j < contador; j++) {

                if (numeros[i] == resultado[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                resultado[contador] = numeros[i];
                contador++;
            }
        }

        System.out.println("\n\nArreglo sin duplicados:");

        for (int i = 0; i < contador; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}