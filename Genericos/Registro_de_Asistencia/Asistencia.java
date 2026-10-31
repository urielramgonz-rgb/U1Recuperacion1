/**
*Genericos Registro de asistencia
*author Uriel Ramírez
*@date 30 octubre 2026
*/
package Genericos.Registro_de_Asistencia;

public class Asistencia<T> {
    private T alumno;
    private boolean presente;

    public void registrar(T alumno, boolean presente) {
        this.alumno = alumno;
        this.presente = presente;
    }

    public void mostrar() {
        System.out.println("Alumno: " + alumno);

        if (presente) {
            System.out.println("Asistencia: Presente");
        } else {
            System.out.println("Asistencia: Ausente");
        }
    }
}