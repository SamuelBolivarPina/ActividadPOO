package Curso;

public class Curso {
    String nombre;
    int codigo;

    public Curso() {
    }

    public Curso(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " | Código: " + codigo);
    }
}
