package Persona;

/*
  CÓDIGO INCORRECTO (El método está fuera del bloque de la clase): ---

  public class Persona {
      String nombre;
      int edad;
  } // <--- La clase se cierra aquí antes del método

    public void mostrarInformacion() { // <--- Error de compilación: 'class, interface, or enum expected'
       System.out.println("Nombre: " + nombre + " | Edad: " + edad);
 }
 */

// --- CÓDIGO CORREGIDO: ---
public class Persona {
    String nombre;
    int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // El método DEBE ir dentro de las llaves { } de la clase
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años");
    }
}
