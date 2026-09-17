package EquipoDeFutbol;

public class main {

    public static int ganarPartido(int puntosActuales) {
        return puntosActuales + 3;
    }

    public static void mostrarEstadisticas(String nombre, String ciudad, int puntos) {
        System.out.println("Equipo: " + nombre + " | Ciudad: " + ciudad + " | Puntos: " + puntos);
    }

    public static void main(String[] args) {
        String nombre1 = "Real Cartagena";
        String ciudad1 = "Cartagena";
        int puntos1 = 24;

        System.out.println("=== Tabla de Posiciones Inicial ===");
        mostrarEstadisticas(nombre1, ciudad1, puntos1);

        puntos1 = ganarPartido(puntos1);

        System.out.println("Después de ganar un partido (+3 pts)");
        mostrarEstadisticas(nombre1, ciudad1, puntos1);
    }
}
