package NegocioGalletas;

public class NegocioGalletas {
    String nombreNegocio;
    String productoEstrella;
    double ventasDiarias;

    public NegocioGalletas() {
    }

    public NegocioGalletas(String nombreNegocio, String productoEstrella, double ventasDiarias) {
        this.nombreNegocio = nombreNegocio;
        this.productoEstrella = productoEstrella;
        this.ventasDiarias = ventasDiarias;
    }
    public void registrarVenta(double monto) {
        if (monto > 0) {
            this.ventasDiarias += monto;
        }
    }
    public void mostrarResumen() {
        System.out.println("Negocio: " + nombreNegocio + " | Producto: " + productoEstrella + " | Ventas del Día: $" + ventasDiarias);
    }
}

