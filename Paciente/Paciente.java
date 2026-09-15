package Paciente;

public class Paciente {
    String nombre;
    int edad;
    String diagnostico;

    public Paciente() {
    }

    public Paciente(String nombre, int edad, String diagnostico) {
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    public void mostrarHistorial() {
        System.out.println("Paciente: " + nombre + " | Edad: " + edad + " años | Diagnóstico: " + diagnostico);
    }
}

/*
 * EXPLICACIÓN PEDAGÓGICA:

 1. "Crear un paciente" (Enfoque del Mundo Real / Dominio del Problema):
 Es una noción conceptual y de modelado. Hace referencia al acto de representar
 a una persona real con sus atributos clínicos (nombre, edad, diagnóstico)
 dentro de la lógica del sistema, independientemente de cómo esté codificado.

 2. "Instanciar la clase Paciente" (Enfoque Técnico / Programación Java):
 Es un mecanismo específico de la Programación Orientada a Objetos que asigna
 físicamente memoria en la RAM reservando espacio para un objeto mediante el
 operador 'new' y ejecutando un constructor.

 Conclusión Pedagógica:
 Se relacionan porque "instanciar" es la forma estándar en POO para "crear" la entidad;
 sin embargo, no son lo mismo porque como demuestra este taller procedimental,
 se puede "crear un paciente" conceptualmente manejando sus datos en variables,
 sin necesidad de instanciar formalmente la clase en memoria.
 */
