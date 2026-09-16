package Semaforo;

public class Semaforo {
    String colorActual;

    public Semaforo() {
    }

    public Semaforo(String colorActual) {
        this.colorActual = colorActual;
    }

    public void cambiarColor() {
        if (this.colorActual.equalsIgnoreCase("Rojo")) {
            this.colorActual = "Verde";
        } else if (this.colorActual.equalsIgnoreCase("Verde")) {
            this.colorActual = "Amarillo";
        } else {
            this.colorActual = "Rojo";
        }
    }

    public void mostrarEstado() {
        System.out.println("Semáforo en luz: " + colorActual);
    }
}
