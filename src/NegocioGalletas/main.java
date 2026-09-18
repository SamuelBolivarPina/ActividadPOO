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
}
