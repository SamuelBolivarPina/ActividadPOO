package Pelicula;

public class Pelicula {
    String nombre;
    String genero;
    int minutos;

    public Pelicula() {
    }

    public Pelicula(String nombre, String genero, int minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre + " | Género: " + genero + " | Duración: " + minutos + " min");
    }
}
