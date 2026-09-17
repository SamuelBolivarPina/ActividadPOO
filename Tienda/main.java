package Tienda;

public class main {

    public static double registrarVenta(double acumuladoActual, double monto) {
        if (monto > 0) {
            return acumuladoActual + monto;
        }
        return acumuladoActual;
    }

    public static void mostrarResumen(String nombre, String direccion, double ventasTotales) {
        System.out.println("Tienda: " + nombre + " | Dirección: " + direccion + " | Ventas Totales: $" + ventasTotales);
    }

    public static void main(String[] args) {
        String nombre1 = "Tienda La Esperanza";
        String direccion1 = "Calle 15 # 20-30";
        double ventasTotales1 = 150000.0;

        System.out.println("Estado Inicial de la Tienda");
        mostrarResumen(nombre1, direccion1, ventasTotales1);

        double nuevaVenta = 45000.0;
        ventasTotales1 = registrarVenta(ventasTotales1, nuevaVenta);

        System.out.println("Después de registrar una venta de $" + nuevaVenta +"");
        mostrarResumen(nombre1, direccion1, ventasTotales1);
    }
}