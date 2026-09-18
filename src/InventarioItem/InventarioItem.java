package InventarioItem;

public class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    public InventarioItem() {
    }
    public InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    public double calcularValorTotal() {
        return this.cantidad * this.precioUnitario;
    }
    public void mostrarItem() {
        System.out.println("Ítem: " + nombre + " | Cantidad: " + cantidad + " | Precio U.: $" + precioUnitario);
        System.out.println("Valor Total en Stock: $" + calcularValorTotal());
    }
}