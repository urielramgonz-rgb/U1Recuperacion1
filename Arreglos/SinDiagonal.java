/**
*Recursividad Sin la diagonal
*author Uriel Ramírez
*@date 30 octubre 2026
*/

public class SinDiagonal {
    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}