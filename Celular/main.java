package Celular;

public class main {

    public static boolean encender() {
        return true;
    }

    public static boolean apagar() {
        return false;
    }

    public static int cargarBateria(int bateriaActual, int cantidad) {
        int nuevaBateria = bateriaActual + cantidad;
        if (nuevaBateria > 100) {
            return 100;
        }
        return nuevaBateria;
    }

    public static void mostrarEstado(String marca, int bateria, boolean prendido) {
        System.out.println("Marca: " + marca + " | Batería: " + bateria + "% | Prendido: " + prendido);
    }

    public static void main(String[] args) {
        // --- Ejercicio 37: Simulación de Celular (Sin 'new') ---
        String marca1 = "Samsung";
        int bateria1 = 45;
        boolean prendido1 = false;

        System.out.println("=== Estado Inicial ===");
        mostrarEstado(marca1, bateria1, prendido1);

        // Encender
        prendido1 = encender();
        System.out.println("\n=== Después de Encender ===");
        mostrarEstado(marca1, bateria1, prendido1);

        // Cargar batería
        bateria1 = cargarBateria(bateria1, 30);
        System.out.println("\n=== Después de Cargar Batería (+30%) ===");
        mostrarEstado(marca1, bateria1, prendido1);

        // Apagar
        prendido1 = apagar();
        System.out.println("\n=== Después de Apagar ===");
        mostrarEstado(marca1, bateria1, prendido1);
    }
}
