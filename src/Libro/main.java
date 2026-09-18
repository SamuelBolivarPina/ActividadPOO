package Libro;

public class main {

    public static void mostrarInfo(String titulo, String autor, int paginas) {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }
    public static void copiarLibro(String titulo, String autor, int paginas) {
        String tituloCopia = titulo;
        String autorCopia = autor;
        int paginasCopia = paginas;

        System.out.println("--- Libro.Libro Copia ---");
        mostrarInfo(tituloCopia, autorCopia, paginasCopia);
    }

    public static void main(String[] args) {
        // --- 1. Simulación de Constructor Vacío ---
        // Se declaran las variables primero (como cuando el constructor vacío crea el objeto sin datos)
        String titulo1;
        String autor1;
        int paginas1;

        // Luego se le asignan los valores línea por línea
        titulo1 = "Cien años de soledad";
        autor1 = "Gabriel García Márquez";
        paginas1 = 471;


        // --- 2. Simulación de Constructor con Parámetros ---
        // Se declaran e inicializan directamente con sus valores en una sola línea
        String titulo2 = "1984";
        String autor2 = "George Orwell";
        int paginas2 = 328;

        System.out.println("Objeto 1 (Simulación Constructor Vacío)");
        mostrarInfo(titulo1, autor1, paginas1);

        System.out.println("\nObjeto 2 (Simulación Constructor con Parámetros)");
        mostrarInfo(titulo2, autor2, paginas2);

        System.out.println("\n=== Ejercicio 34 ===");
        String tituloOriginal = "Fahrenheit 451";
        String autorOriginal = "Ray Bradbury";
        int paginasOriginal = 249;

        System.out.println("--- Libro.Libro Original ---");
        mostrarInfo(tituloOriginal, autorOriginal, paginasOriginal);

        // Simulación del constructor copia usando las variables del original
        copiarLibro(tituloOriginal, autorOriginal, paginasOriginal);
    }
}
        /*
         * CONCLUSIÓN EJERCICIO 22:

         La clase 'Libro.Libro' es una PLANTILLA porque solo define la estructura y el comportamiento
         general (los atributos 'titulo', 'autor', 'paginas' y el método 'mostrarInfo')
         sin contener datos reales de ningún libro en particular.

         Los cuatro 'libros' creados son OBJETOS (casos concretos) porque son instancias reales
         en memoria donde cada uno tiene sus propios valores específicos asignados
         a esos atributos.
         */

