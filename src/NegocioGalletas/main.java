package NegocioGalletas;
import java.lang.reflect.Constructor;
public class main {
    // Métodos estáticos procedimentales
    public static double registrarVentaProc(double acumuladoActual, double monto) {
        if (monto > 0) {
            return acumuladoActual + monto;
        }
        return acumuladoActual;
    }

    public static void mostrarResumenProc(String nombreNegocio, String productoEstrella, double ventasDiarias) {
        System.out.println("Negocio: " + nombreNegocio + " | Producto: " + productoEstrella + " | Ventas del Día: $" + ventasDiarias);
    }
}