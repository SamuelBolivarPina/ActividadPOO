package Semaforo;

public class main {

    public static String cambiarColor(String colorActual) {
        if (colorActual.equalsIgnoreCase("Rojo")) {
            return "Verde";
        } else if (colorActual.equalsIgnoreCase("Verde")) {
            return "Amarillo";
        } else {
            return "Rojo";
        }
    }

    public static void mostrarEstado(String colorActual) {
        System.out.println("Semáforo en luz: " + colorActual);
    }

    public static void main(String[] args) {

        String colorActual1 = "Rojo";

        System.out.println("=== Ciclo del Semáforo ===");
        mostrarEstado(colorActual1);

        colorActual1 = cambiarColor(colorActual1);
        mostrarEstado(colorActual1);

        colorActual1 = cambiarColor(colorActual1);
        mostrarEstado(colorActual1);

        colorActual1 = cambiarColor(colorActual1);
        mostrarEstado(colorActual1);

    }
}
