package Producto;
public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto() {
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    void vender(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
        } else {
            System.out.println("Stock insuficiente.");
        }

    }

    void restablecer(int cantidad) {
        stock += cantidad;
    }

    public static void crearProductoBasico(String nombre){
        int stock = 1;
        double precio = 10.0;
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }
}