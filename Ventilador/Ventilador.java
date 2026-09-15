package Ventilador;

public class Ventilador {
    String marca;
    int velocidad;
    boolean encendido;

    public Ventilador() {
    }

    public Ventilador(String marca, int velocidad, boolean encendido) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.encendido = encendido;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
        velocidad = 0;
    }

    public void subirVelocidad() {
        if (encendido) {
            velocidad++;
        }
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca + " | Velocidad: " + velocidad + " | Encendido: " + encendido);
    }
}