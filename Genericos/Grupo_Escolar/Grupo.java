/**
*Genericos Registro de asistencia
*author Uriel Ramírez
*@date 30 octubre 2026
*/

package Genericos.Grupo_Escolar;

public class Grupo<T> {
    private T alumno1;
    private T alumno2;
    private T alumno3;

    public void agregarAlumnos(T alumno1, T alumno2, T alumno3) {
        this.alumno1 = alumno1;
        this.alumno2 = alumno2;
        this.alumno3 = alumno3;
    }

    public void mostrarGrupo() {
        System.out.println("Integrantes del grupo:");
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
    }
}