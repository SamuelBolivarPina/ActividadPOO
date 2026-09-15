package Producto;
public class main {
    public static void mostrarProducto(String nombre, double precio, int stock) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }

    public static void main(String[] args) {
        // Producto 1
        String nombre1 = "Laptop";
        double precio1 = 2500000.0;
        int stock1 = 10;

        // Producto 2
        String nombre2 = "Mouse";
        double precio2 = 45000.0;
        int stock2 = 50;

        // Producto 3
        String nombre3 = "Teclado";
        double precio3 = 120000.0;
        int stock3 = 25;

        // Mostrar los 3 productos con estados distintos
        System.out.println("--- Producto 1 ---");
        mostrarProducto(nombre1, precio1, stock1);

        System.out.println("\n--- Producto 2 ---");
        mostrarProducto(nombre2, precio2, stock2);

        System.out.println("\n--- Producto 3 ---");
        mostrarProducto(nombre3, precio3, stock3);
    }
}
