package Avion;

public class Avion {
    String aerolinea;
    String destino;
    int pasajeros;

    public Avion() {
    }
    public Avion(String aerolinea, String destino, int pasajeros) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }
    public void abordar(int cantidad) {
        if (cantidad > 0) {
            this.pasajeros += cantidad;
        }
    }
    public void mostrarVuelo() {
        System.out.println("Aerolínea: " + aerolinea + " | Destino: " + destino + " | Pasajeros: " + pasajeros);
    }
}
