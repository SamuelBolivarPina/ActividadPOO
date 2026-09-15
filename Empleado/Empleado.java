package Empleado;

public class Empleado {
    String nombre;
    String cargo;
    double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " | Cargo: " + cargo + " | Salario: $" + salario);
    }
}
/*
 EXPLICACIÓN / CONCLUSIÓN:

 Modelar la entidad 'Empleado' mediante una Clase y Objetos en lugar de programación
 procedimental (variables sueltas como 'nombre1', 'salario1', 'nombre2', 'salario2')
 es superior porque permite agrupar en una sola estructura tanto el estado (sus atributos)
 como el comportamiento (sus métodos).

 Con variables sueltas, el código se vuelve caótico, difícil de mantener y propenso a
 errores a medida que aumenta el número de empleados. La Programación Orientada a
 Objetos (POO) nos entrega una plantilla clara, reutilizable y escalable que encapsula
 la información de forma coherente y modular.
 */