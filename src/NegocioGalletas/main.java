package NegocioGalletas;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

    public static void main(String[] args) {
        try {
            // =========================================================
            // 1. DEMOSTRACIÓN POO: 5 Objetos de NegocioGalletas (SIN 'new')
            // =========================================================
            System.out.println("=== 5 OBJETOS CLASE: NegocioGalletas (POO - Sin 'new') ===");

            // Obtener el constructor de la clase NegocioGalletas desde el paquete
            Constructor<NegocioGalletas> consNegocio = NegocioGalletas.class.getConstructor(String.class, String.class, double.class);

            // Instanciación reflexiva de los 5 objetos individuales
            NegocioGalletas n1 = consNegocio.newInstance("Galletas Artesanales", "Galleta de Chispas", 85000.0);
            NegocioGalletas n2 = consNegocio.newInstance("Sweet Cookies", "Avena y Miel", 120000.0);
            NegocioGalletas n3 = consNegocio.newInstance("Crispy Bakes", "Mantequilla", 60000.0);
            NegocioGalletas n4 = consNegocio.newInstance("Don Cookie", "Rellenas de Nutella", 150000.0);
            NegocioGalletas n5 = consNegocio.newInstance("Bakery Express", "Red Velvet", 95000.0);

            n1.registrarVenta(15000.0);

            // Impresión del resumen de cada objeto
            n1.mostrarResumen();
            n2.mostrarResumen();
            n3.mostrarResumen();
            n4.mostrarResumen();
            n5.mostrarResumen();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
