package Videojuego;

public class Videojuego {
    String titulo;
    String genero;

    public Videojuego() {
    }

    public Videojuego(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public void iniciarJuego() {
        System.out.println("Iniciando " + titulo + " [" + genero + "]...");
    }
}