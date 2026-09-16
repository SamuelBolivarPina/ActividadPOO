package FacturaSimple;

public class main {

    public static void mostrarFactura(int numero, String cliente, double valor) {
        System.out.println("Factura N°: " + numero + " | Cliente: " + cliente + " | Valor Total: $" + valor);
    }

    public static void main(String[] args) {
        int numero1 = 1001;
        String cliente1 = "María López";
        double valor1 = 250000.0;

        System.out.println("=== Detalle de la Factura ===");
        mostrarFactura(numero1, cliente1, valor1);
    }
}
