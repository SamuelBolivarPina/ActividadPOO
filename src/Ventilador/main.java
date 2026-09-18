package Ventilador;

public class main {

    public static boolean encender() {
        return true;
    }


    public static boolean apagar() {
        return false;
    }

    public static int subirVelocidad(int velocidadActual, boolean encendido) {
        if (encendido) {
            return velocidadActual + 1;
        }
        return velocidadActual;
    }

    public static void mostrarEstado(String marca, int velocidad, boolean encendido) {
        System.out.println("Marca: " + marca + " | Velocidad: " + velocidad + " | Encendido: " + encendido);
    }

    public static void main(String[] args) {
        // --- Ejercicio 38: Simulación de Ventilador (Sin 'new') ---
        String marca1 = "Samurai";
        int velocidad1 = 0;
        boolean encendido1 = false;

        System.out.println("=== Estado Inicial ===");
        mostrarEstado(marca1, velocidad1, encendido1);

        // Encender
        encendido1 = encender();
        velocidad1 = 1; // Inicia en velocidad 1 al encender
        System.out.println(" Después de Encender");
        mostrarEstado(marca1, velocidad1, encendido1);

        // Subir velocidad
        velocidad1 = subirVelocidad(velocidad1, encendido1);
        System.out.println("Después de Subir Velocidad");
        mostrarEstado(marca1, velocidad1, encendido1);

        // Apagar
        encendido1 = apagar();
        velocidad1 = 0;
        System.out.println("Después de Apagar");
        mostrarEstado(marca1, velocidad1, encendido1);
    }
}
