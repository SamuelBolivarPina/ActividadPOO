package Vehiculo;
public class Main {

    public static void mostrarEstadoVehiculo(String marca, String modelo, int velocidadActual) {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        // --- Vehículo 1 ---
        String marca1 = "Toyota";
        String modelo1 = "Corolla";
        int velocidadActual1 = 60;

        // --- Vehículo 2 ---
        String marca2 = "Chevrolet";
        String modelo2 = "Onix";
        int velocidadActual2 = 80;

        // ---Vehiculo.Vehiculo 3 ---
        String marca3 = "BMW";
        String modelo3 = "M3 GTR (E46)";
        int velocidadActual3 = 120;

        // Imprimir información del primer vehículo
        System.out.println("--- Vehículo 1 ---");
        mostrarEstadoVehiculo(marca1, modelo1, velocidadActual1);

        System.out.println(); // Línea de separación

        // Imprimir información del segundo vehículo
        System.out.println("--- Vehículo 2 ---");
        mostrarEstadoVehiculo(marca2, modelo2, velocidadActual2);

        // imprimir infomacion del tercer vehiculo
        System.out.println("--- Vehiculo.Vehiculo 3 ---");
        mostrarEstadoVehiculo(marca3,modelo3,velocidadActual3);

        System.out.println();
        /*
         EXPLICACIÓN EJERCICIO 20:

         ¿Qué comparten?
         Comparten la misma estructura (atributos: marca, modelo, velocidadActual)
         y los mismos comportamientos/métodos (mostrarEstado, acelerar, frenar)
         definidos en la clase Vehiculo.Vehiculo.

         ¿En qué se diferencian?
         Se diferencian en el estado particular de sus datos (sus valores asignados)
         y en la posición de memoria independiente que ocupa cada objeto.
         */
    }
}