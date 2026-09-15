package Tablet;

public class main {

    /*
      --- CÓDIGO INCORRECTO (Intentar usar una tablet sin haberla creado/inicializado): ---

      En POO tradicional:
      Tablet miTablet; // Solo se declara la variable, contiene 'null'
      miTablet.mostrarInfo(); // <--- Lanza 'NullPointerException' en tiempo de ejecución

      En enfoque procedimental:
      String marca1;
      int almacenamientoGB1;
      mostrarInfo(marca1, almacenamientoGB1); // <--- Error de compilación: 'variable might not have been initialized'
     */

    // Método estático para mostrar la información
    public static void mostrarInfo(String marca, int almacenamientoGB) {
        System.out.println("Marca: " + marca + " | Almacenamiento: " + almacenamientoGB + "GB");
    }

    public static void main(String[] args) {
        // --- CÓDIGO CORREGIDO: Asignar valores antes de invocar el método ---
        String marca1 = "Apple iPad";
        int almacenamientoGB1 = 128;

        System.out.println("=== Especificaciones de la Tablet ===");
        mostrarInfo(marca1, almacenamientoGB1);

        /*
         EXPLICACIÓN / CONCLUSIÓN:

          1. En POO (Con 'new'): Declarar la variable 'Tablet miTablet;' reserva el puntero
             en memoria stack pero no crea la estructura en el Heap. Intentar usar sus
             métodos sin instanciar genera un 'NullPointerException'.

          2. En enfoque procedimental (Sin 'new'): Java bloquea la compilación si intentas
             pasar variables locales como argumentos sin haberles asignado un valor previamente.
         */
    }
}
