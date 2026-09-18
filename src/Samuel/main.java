package Samuel;

public class main {
    // Métodos estáticos procedimentales
    public static int cumplirAnioProc(int edadActual) {
        return edadActual + 1;
    }
    public static void mostrarPerfilProc(String nombre, int edad, String universidad, String carrera) {
        System.out.println("Estudiante: " + nombre + " | Edad: " + edad + " años");
        System.out.println("Universidad: " + universidad + " | Carrera: " + carrera);
    }
}
