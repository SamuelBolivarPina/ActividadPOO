public class Estudiante {
    String nombre;
    String codigo;
    int semestre;
    void mostrarInfo(){
        System.out.println("Nombre :" + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Semestre" + semestre);
    }
    void cambiarSemestre(int nuevoSemestre){
        semestre = nuevoSemestre;
    }
    /* Explicacion del ejercicio 19
    Estudiante es la CLASE porque sirve como plantilla/molde general.
    est1 es el OBJETO porque es la instancia real cargada en memoria con datos específicos.
     */
}
