package Celular;

public class Celular {
    String marca;
    int bateria;
    boolean prendido;

    public Celular() {
    }

    public Celular(String marca, int bateria, boolean prendido) {
        this.marca = marca;
        this.bateria = bateria;
        this.prendido = prendido;
    }

    public void encender() {
        prendido = true;
    }

    public void apagar() {
        prendido = false;
    }

    public void cargarBateria(int cantidad) {
        bateria += cantidad;
        if (bateria > 100) {
            bateria = 100;
        }
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca + " | Batería: " + bateria + "% | Prendido: " + prendido);
    }
}
