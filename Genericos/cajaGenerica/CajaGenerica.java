/**
*Recursividad Quitar duplicados
*author Uriel Ramírez
*@date 30 octubre 2026
*/

package Genericos.CajaGenerica;

public class CajaGenerica {
    public static void main(String[] args) {

        Caja<String> caja = new Caja<>();
        caja.guardar("Chetos");

        Caja<Integer> numero = new Caja<>();
        numero.guardar(20);

        System.out.println("Producto: " + caja.obtener());
        System.out.println("Precio: " + numero.obtener());
    }
}