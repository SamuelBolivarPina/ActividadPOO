public class Mascota {
    String nombre;
    String raza;
    int edad;
    void mostrarMascota(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
    }
    void cumplirAnios(){
        edad ++;
    }
    /* Explicacion del ejercicio 19
    Estudiante es la CLASE porque sirve como plantilla/molde general.
    est1 es el OBJETO porque es la instancia real cargada en memoria con datos específicos.
     */
}
