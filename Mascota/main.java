package Mascota;

public class main {

    public static void mostrarMascota(String nombre, String raza, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
    }

    public static void main(String[] args) {
        // Datos iniciales
        String nombre = "Firulais";
        String raza = "Labrador";
        int edad = 2; // Edad inicial

        System.out.println("Estado Inicial");
        mostrarMascota(nombre, raza, edad);

        // Primer cambio de edad
        edad = 3;
        System.out.println("Después del Primer Cambio de Edad");
        mostrarMascota(nombre, raza, edad);

        // Segundo cambio de edad
        edad = 5;
        System.out.println("Después del Segundo Cambio de Edad");
        mostrarMascota(nombre, raza, edad);
    }
}