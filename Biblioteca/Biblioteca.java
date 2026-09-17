package Biblioteca;
/*
Análisis Previo
Atributos:

nombre (String): Nombre de la biblioteca.

direccion (String): Ubicación física.

totalLibros (int): Cantidad actual de libros registrados en el inventario.

Métodos:

registrarLibros(int cantidad): Añade nuevos ejemplares al catálogo.

mostrarInfo(): Imprime los detalles y el estado del catálogo.

Objetos reales que podrían construirse:

biblioteca1: "Biblioteca Luis Ángel Arango", dirección "Calle 11 # 4-14", 50000 libros.

biblioteca2: "Biblioteca Departamental", dirección "Av. Central # 25", 12000 libros.
 */
public class Biblioteca {
    String nombre;
    String direccion;
    int totalLibros;

    public Biblioteca() {
    }

    public Biblioteca(String nombre, String direccion, int totalLibros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.totalLibros = totalLibros;
    }

    public void registrarLibros(int cantidad) {
        if (cantidad > 0) {
            this.totalLibros += cantidad;
        }
    }
    public void mostrarInfo() {
        System.out.println("Biblioteca: " + nombre + " | Dirección: " + direccion + " | Libros: " + totalLibros);
    }
}
