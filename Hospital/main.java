package Hospital;

public class main {

    public static int ingresarPaciente(int ocupacionActual, int nuevosPacientes) {
        if (nuevosPacientes > 0) {
            return ocupacionActual + nuevosPacientes;
        }
        return ocupacionActual;
    }

    public static void mostrarEstado(String nombre, String ciudad, int camasOcupadas) {
        System.out.println("Hospital: " + nombre + " | Ciudad: " + ciudad + " | Camas Ocupadas: " + camasOcupadas);
    }

    public static void main(String[] args) {
        String nombre1 = "Hospital Universitario del Caribe";
        String ciudad1 = "Cartagena";
        int camasOcupadas1 = 120;

        System.out.println("=== Estado Inicial del Hospital ===");
        mostrarEstado(nombre1, ciudad1, camasOcupadas1);

        int nuevosIngresos = 5;
        camasOcupadas1 = ingresarPaciente(camasOcupadas1, nuevosIngresos);

        System.out.println("Después de ingresar " + nuevosIngresos + " pacientes");
        mostrarEstado(nombre1, ciudad1, camasOcupadas1);
    }
}