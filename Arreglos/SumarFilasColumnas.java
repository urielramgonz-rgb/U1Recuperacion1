/**
*Recursividad Sumar filas y columnas
*author Uriel Ramírez
*@date 30 octubre 2026
*/

public class SumarFilasColumnas {
    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Sumar filas
        for (int i = 0; i < matriz.length; i++) {

            int suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }

            System.out.println("Suma de la fila " + (i + 1) + ": " + suma);
        }

        // Sumar columnas
        System.out.println();

        for (int j = 0; j < matriz[0].length; j++) {

            int suma = 0;

            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }

            System.out.println("Suma de la columna " + (j + 1) + ": " + suma);
        }
    }
}