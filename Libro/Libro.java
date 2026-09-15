public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro(){

    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }
}
