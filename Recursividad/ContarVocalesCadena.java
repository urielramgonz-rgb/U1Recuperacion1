/**
*Recursividad Contar vocales de una cadena
*author Uriel Ramírez
*@date 30 octubre 2026
*/

public class ContarVocalesCadena {

    public static int contarVocales(String cadena, int posicion) {

        if (posicion == cadena.length()) {
            return 0;
        }

        char letra = Character.toLowerCase(cadena.charAt(posicion));

        if (letra == 'a' || letra == 'e' || letra == 'i' ||
            letra == 'o' || letra == 'u') {

            return 1 + contarVocales(cadena, posicion + 1);

        } else {
            return contarVocales(cadena, posicion + 1);
        }
    }

    public static void main(String[] args) {

        String texto = "Hola";

        int resultado = contarVocales(texto, 0);

        System.out.println("Cadena: " + texto);
        System.out.println("Cantidad de vocales: " + resultado);
    }
}