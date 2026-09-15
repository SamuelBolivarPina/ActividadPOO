package Puerta;

public class Puerta {
    String material;
    boolean abierta;

    public Puerta() {
    }

    public Puerta(String material, boolean abierta) {
        this.material = material;
        this.abierta = abierta;
    }

    public void abrir() {
        abierta = true;
    }

    public void cerrar() {
        abierta = false;
    }

    public void mostrarEstado() {
        System.out.println("Material: " + material + " | Abierta: " + abierta);
    }
}