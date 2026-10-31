/**
*Recursividad Palindromo
*author Uriel Ramírez
*@date 30 octubre 2026
*/

public class Palindromo {

    public static boolean esPalindromo(String palabra, int inicio, int fin) {

        if (inicio >= fin) {
            return true;
        }

        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }

        return esPalindromo(palabra, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {

        String palabra = "radar";

        if (esPalindromo(palabra, 0, palabra.length() - 1)) {
            System.out.println(palabra + " es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
}