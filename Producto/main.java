package Producto;

public class main {

    public static void mostrarProducto(String nombre, double precio, int stock) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
    public static void crearProductoBasico(String nombre){
        System.out.println("Precio Basico: " +);
    }
    public static void main(String[] args) {
        // --- Simulación de Constructor Vacío ---
        // Declaración previa de variables
        String nombre1;
        double precio1;
        int stock1;


        nombre1 = "Teclado";
        precio1 = 45.0;
        stock1 = 10;


        String nombre2 = "Mouse";
        double precio2 = 25.0;
        int stock2 = 15;

        // Mostrar resultados
        System.out.println("Producto 1 (Simulación Constructor Vacío)");
        mostrarProducto(nombre1, precio1, stock1);

        System.out.println(" Producto 2 (Simulación Constructor con Parámetros)");
        mostrarProducto(nombre2, precio2, stock2);
    }
    public static void crearProductoBasico(){

    }
}

