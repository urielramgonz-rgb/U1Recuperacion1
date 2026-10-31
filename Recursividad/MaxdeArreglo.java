/**
*Recursividad Maximo de un arreglo
*author Uriel Ramírez
*@date 30 octubre 2026
*/

public class MaxdeArreglo {

    public static int encontrarMaximo(int[] arreglo, int n) {

        if (n == 1) {
            return arreglo[0];
        }

        int maximoAnterior = encontrarMaximo(arreglo, n - 1);

        if (arreglo[n - 1] > maximoAnterior) {
            return arreglo[n - 1];
        } else {
            return maximoAnterior;
        }
    }

    public static void main(String[] args) {

        int[] numeros = {5, 12, 3, 25, 8, 17};

        int maximo = encontrarMaximo(numeros, numeros.length);

        System.out.println("El número máximo es: " + maximo);
    }
}