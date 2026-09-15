public class main {
    public static void main(String[] args) {
        // Crear el objeto 1
        Libro libro1 = new Libro();
        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.paginas = 471;

        // Crear el objeto 2
        Libro libro2 = new Libro();
        libro2.titulo = "Don Quijote de la Mancha";
        libro2.autor = "Miguel de Cervantes";
        libro2.paginas = 863;

        // Crear el objeto 3
        Libro libro3 = new Libro();
        libro3.titulo = "El principito";
        libro3.autor = "Antoine de Saint-Exupéry";
        libro3.paginas = 96;

        // Crear el objeto 4
        Libro libro4 = new Libro();
        libro4.titulo = "1984";
        libro4.autor = "George Orwell";
        libro4.paginas = 328;

        // Mostrar la información de cada objeto
        System.out.println("LISTA DE LIBROS");
        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
        libro4.mostrarInfo();
    }
}
