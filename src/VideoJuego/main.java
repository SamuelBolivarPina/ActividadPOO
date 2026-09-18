package VideoJuego;

public class main {

    /*
      CÓDIGO INCORRECTO (La clase existe, pero 'Libro.main' está vacío o no la usa):

      public static void Libro.main(String[] args) {
          // El método Libro.main no contiene código o ignora la entidad 'Videojuego'.
          // La clase 'Videojuego' existe en el proyecto, pero jamás se ejecuta ni instancia.
      }
     */

    // Método estático procedimental para simular la ejecución
    public static void iniciarJuego(String titulo, String genero) {
        System.out.println("Iniciando " + titulo + " [" + genero + "]...");
    }

    public static void main(String[] args) {
        // --- CÓDIGO CORREGIDO: Declarar e invocar la entidad en el Libro.main ---
        String titulo1 = "Hollow Knight";
        String genero1 = "Metroidvania";

        System.out.println("Ejecución del Programa");
        iniciarJuego(titulo1, genero1);

        /*
          EXPLICACIÓN / CONCLUSIÓN:

          1. En POO: Definir una clase solo crea el plano o la plantilla en el archivo .java.
             Si en el método 'Libro.main' no se construye la instancia (objeto) ni se llaman a sus métodos,
            el programa no realizará ninguna acción en tiempo de ejecución.

          2. En enfoque procedimental: Del mismo modo, declarar funciones o variables en una clase
             no sirve de nada si el punto de entrada 'Libro.main' no las invoca explícitamente para
             ejecutar la lógica deseada.
         */
    }
}
