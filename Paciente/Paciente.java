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
