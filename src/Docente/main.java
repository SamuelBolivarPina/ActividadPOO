package Docente;

public class main {

    public static int asignarHoras(int horasActuales, int nuevasHoras) {
        if (nuevasHoras > 0) {
            return horasActuales + nuevasHoras;
        }
        return horasActuales;
    }

    public static void mostrarPerfil(String nombre, String asignatura, int horasLectivas) {
        System.out.println("Docente: " + nombre + " | Asignatura: " + asignatura + " | Horas/Semana: " + horasLectivas);
    }

    public static void main(String[] args) {
        String nombre1 = "John Carlos Arrieta";
        String asignatura1 = "Programación Orientada a Objetos";
        int horasLectivas1 = 16;

        System.out.println("Perfil Inicial del Docente");
        mostrarPerfil(nombre1, asignatura1, horasLectivas1);

        int horasExtra = 4;
        horasLectivas1 = asignarHoras(horasLectivas1, horasExtra);

        System.out.println("Después de asignar " + horasExtra + " horas extra");
        mostrarPerfil(nombre1, asignatura1, horasLectivas1);
    }
}
