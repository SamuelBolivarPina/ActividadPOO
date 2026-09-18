package Tienda;
/*
Análisis Previo
Atributos:

nombre (String): Nombre del establecimiento comercial.

direccion (String): Ubicación o dirección física.

ventasTotales (double): Acumulado de ventas registradas en dinero.

Métodos:

registrarVenta(double monto): Incrementa el total de ventas acumuladas.

mostrarResumen(): Imprime la información general de la tienda y sus ventas.

Objetos reales que podrían construirse:

tienda1: "Tienda La Esperanza", dirección "Calle 15 # 20-30", $150,000.0 en ventas.

tienda2: "Supermercado El Sol", dirección "Av. Pedro de Heredia # 45-12", $850,000.0 en ventas.
 */
public class Tienda {
    String nombre;
    String direccion;
    double ventasTotales;

    public Tienda() {
    }

    public Tienda(String nombre, String direccion, double ventasTotales) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ventasTotales = ventasTotales;
    }
    public void registrarVenta(double monto) {
        if (monto > 0) {
            this.ventasTotales += monto;
        }
    }
    public void mostrarResumen() {
        System.out.println("Tienda: " + nombre + " | Dirección: " + direccion + " | Ventas Totales: $" + ventasTotales);
    }
}
