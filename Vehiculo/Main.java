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

        // Imprimir información del primer vehículo
        System.out.println("--- Vehículo 1 ---");
        mostrarEstadoVehiculo(marca1, modelo1, velocidadActual1);

        System.out.println(); // Línea de separación

        // Imprimir información del segundo vehículo
        System.out.println("--- Vehículo 2 ---");
        mostrarEstadoVehiculo(marca2, modelo2, velocidadActual2);
    }
}