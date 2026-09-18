package Alumno;

/*
   CÓDIGO INCORRECTO (Falta el nombre/identificador de la clase):

  public class { // <--- Error de sintaxis: '<identifier> expected'
      String nombre;
      double nota;

      public void mostrarNota() {
          System.out.println("Alumno: " + nombre + " | Nota: " + nota);
      }
 }
 */

// --- CÓDIGO CORREGIDO: ---
public class Alumno {
    String nombre;
    double nota;

    public Alumno() {
    }

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void mostrarNota() {
        System.out.println("Alumno: " + nombre + " | Nota: " + nota);
    }
}
