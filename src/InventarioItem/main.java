package InventarioItem;

public class main {

    public static double calcularValorTotal(int cantidad, double precioUnitario) {
        return cantidad * precioUnitario;
    }

    public static void mostrarItem(String nombre, int cantidad, double precioUnitario) {
        double valorTotal = calcularValorTotal(cantidad, precioUnitario);
        System.out.println("Ítem: " + nombre + " | Cantidad: " + cantidad + " | Precio U.: $" + precioUnitario);
        System.out.println("Valor Total en Stock: $" + valorTotal);
    }

    public static void main(String[] args) {
        String nombre1 = "Teclado Mecánico";
        int cantidad1 = 15;
        double precioUnitario1 = 45000.0;

        System.out.println("Detalle del Inventario");
        mostrarItem(nombre1, cantidad1, precioUnitario1);
    }
}
