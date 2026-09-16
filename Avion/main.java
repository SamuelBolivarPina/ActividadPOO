package Avion;

public class main {

    public static int abordar(int pasajerosActuales, int cantidad) {
        if (cantidad > 0) {
            return pasajerosActuales + cantidad;
        }
        return pasajerosActuales;
    }
    public static void mostrarVuelo(String aerolinea, String destino, int pasajeros) {
        System.out.println("Aerolínea: " + aerolinea + " | Destino: " + destino + " | Pasajeros: " + pasajeros);
    }
    public static void main(String[] args) {
        String aerolinea1 = "Avianca";
        String destino1 = "Bogotá";
        int pasajeros1 = 120;

        System.out.println("Estado Inicial del Vuelo");
        mostrarVuelo(aerolinea1, destino1, pasajeros1);

        int nuevosPasajeros = 15;
        pasajeros1 = abordar(pasajeros1, nuevosPasajeros);

        System.out.println("Después de abordar " + nuevosPasajeros + " pasajeros");
        mostrarVuelo(aerolinea1, destino1, pasajeros1);
    }
}
