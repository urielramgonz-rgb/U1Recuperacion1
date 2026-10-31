/**
*Genericos Caja generica: caja
*author Uriel Ramírez
*@date 30 octubre 2026
*/

package Genericos.CajaGenerica;

public class Caja<T> {
    private T contenido;

    public void guardar(T contenido) {
        this.contenido = contenido;
    }

    public T obtener() {
        return contenido;
    }
}