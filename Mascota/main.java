package Mascota;

public class main {

    public static void mostrarMascota(String nombre, String raza, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
    }

    public static void main(String[] args) {
        // Datos iniciales
        String nombre1 = "Firulais";
        String raza1 = "Labrador";
        int edad1 = 2; // Edad inicial

        System.out.println("Estado Inicial");
        mostrarMascota(nombre1, raza1, edad1);

        // Primer cambio de edad
        edad1 = 3;
        System.out.println("Después del Primer Cambio de Edad");
        mostrarMascota(nombre1, raza1, edad1);

        // Segundo cambio de edad
        edad1 = 5;
        System.out.println("Después del Segundo Cambio de Edad");
        mostrarMascota(nombre1, raza1, edad1);

        // creando segundo objeto
        String nombre2 = "Dreikol";
        String raza2 = "Poochin";
        int edad2 = 2;

        System.out.println("Estado inicial");
        mostrarMascota(nombre2,raza2,edad2);

        //primer cambio de edad
        edad2 = 3;
        System.out.println("Despues del Primer cambio de edad");
        mostrarMascota(nombre2,raza2,edad2);

        edad2 = 5;
        System.out.println("Despues del segundo cambio de edad");
        mostrarMascota(nombre2,raza2,edad2);

    }
}