/**
*Genericos Registro de asistencia
*author Uriel Ramírez
*@date 30 octubre 2026
*/

package Genericos.Registro_de_Asistencia;

public class RegistroAsistencia {
    public static void main(String[] args) {

        Asistencia<String> alumno1 = new Asistencia<>();
        alumno1.registrar("Carlos", true);

        Asistencia<String> alumno2 = new Asistencia<>();
        alumno2.registrar("Uriel", false);

        alumno1.mostrar();

        System.out.println();

        alumno2.mostrar();
    }
}