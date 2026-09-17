package Docente;
/*
Análisis Previo
Atributos:

nombre (String): Nombre completo del docente.

asignatura (String): Materia que imparte.

horasLectivas (int): Cantidad de horas de clase a la semana.

Métodos:

asignarHoras(int horas): Incrementa o actualiza la carga horaria.

mostrarPerfil(): Imprime la información y estado del docente.

Objetos reales que podrían construirse:

docente1: "John Carlos Arrieta", asignatura "Programación Orientada a Objetos", 16 horas.

docente2: "Laura Martínez", asignatura "Cálculo Integral", 20 horas.
 */
public class Docente {
    String nombre;
    String asignatura;
    int horasLectivas;

    public Docente() {
    }

    public Docente(String nombre, String asignatura, int horasLectivas) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.horasLectivas = horasLectivas;
    }
    public void asignarHoras(int horas) {
        if (horas > 0) {
            this.horasLectivas += horas;
        }
    }
    public void mostrarPerfil() {
        System.out.println("Docente: " + nombre + " | Asignatura: " + asignatura + " | Horas/Semana: " + horasLectivas);
    }
}
