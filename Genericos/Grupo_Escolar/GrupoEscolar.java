/**
*Genericos Registro de asistencia
*author Uriel Ramírez
*@date 30 octubre 2026
*/

package Genericos.Grupo_Escolar;

public class GrupoEscolar {
    public static void main(String[] args) {

        Grupo<String> grupo1 = new Grupo<>();

        grupo1.agregarAlumnos("Ana", "Luis", "Pedro");

        grupo1.mostrarGrupo();

        System.out.println();

        Grupo<Integer> grupo2 = new Grupo<>();

        grupo2.agregarAlumnos(101, 102, 103);

        grupo2.mostrarGrupo();
    }
}