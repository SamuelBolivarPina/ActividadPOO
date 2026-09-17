package Hospital;
/*
Análisis Previo
Atributos:

nombre (String): Nombre de la institución de salud.

ciudad (String): Ciudad donde se ubica el hospital.

camasOcupadas (int): Cantidad actual de pacientes internados.

Métodos:

ingresarPaciente(int cantidad): Incrementa el número de camas ocupadas.

mostrarEstado(): Imprime la información general y el número de pacientes actuales.

Objetos reales que podrían construirse:

hospital1: "Hospital Universitario del Caribe", ciudad "Cartagena", 120 camas ocupadas.

hospital2: "Hospital San Juan de Dios", ciudad "Bogotá", 250 camas ocupadas.
 */
public class Hospital {
    String nombre;
    String ciudad;
    int camasOcupadas;

    public Hospital() {
    }

    public Hospital(String nombre, String ciudad, int camasOcupadas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.camasOcupadas = camasOcupadas;
    }
    public void ingresarPaciente(int cantidad) {
        if (cantidad > 0) {
            this.camasOcupadas += cantidad;
        }
    }
    public void mostrarEstado() {
        System.out.println("Hospital: " + nombre + " | Ciudad: " + ciudad + " | Camas Ocupadas: " + camasOcupadas);
    }
}
