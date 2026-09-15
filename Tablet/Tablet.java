package Tablet;

public class Tablet {
    String marca;
    int almacenamientoGB;

    public Tablet() {
    }

    public Tablet(String marca, int almacenamientoGB) {
        this.marca = marca;
        this.almacenamientoGB = almacenamientoGB;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Almacenamiento: " + almacenamientoGB + "GB");
    }
}
