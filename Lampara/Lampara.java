package Lampara;

public class Lampara {
    String marca;
    boolean encendida;

    public Lampara() {
    }

    public Lampara(String marca, boolean encendida) {
        this.marca = marca;
        this.encendida = encendida;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca + " | Encendida: " + encendida);
    }
}
