package Cancion;

public class Cancion {
    String titulo;
    String artista;
    double duracion;

    public Cancion() {
    }

    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Artista: " + artista + " | Duración: " + duracion + " min");
    }
}
