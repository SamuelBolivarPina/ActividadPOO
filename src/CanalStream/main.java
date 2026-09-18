package CanalStream;
import java.lang.reflect.Constructor;
public class main {
    public static double transmitirProc(double horasActuales, double horasNuevas) {
        if (horasNuevas > 0) {
            return horasActuales + horasNuevas;
        }
        return horasActuales;
    }

    public static void mostrarEstadisticasProc(String nombreCanal, String plataforma, double horasTransmitidas) {
        System.out.println("Canal: " + nombreCanal + " | Plataforma: " + plataforma + " | Horas Emitidas: " + horasTransmitidas + " hrs");
    }

    public static void main(String[] args) {
        try {
            // =========================================================
            // 1. DEMOSTRACIÓN POO: 5 Objetos de CanalStream (SIN 'new')
            // =========================================================
            System.out.println("=== 5 OBJETOS CLASE: CanalStream (POO - Sin 'new') ===");

            // Obtener el constructor de la clase CanalStream desde el paquete
            Constructor<CanalStream> consCanal = CanalStream.class.getConstructor(String.class, String.class, double.class);

            // Instanciación reflexiva de los 5 objetos individuales
            CanalStream c1 = consCanal.newInstance("Tremord", "Kick", 12.5);
            CanalStream c2 = consCanal.newInstance("ProGamer", "Twitch", 45.0);
            CanalStream c3 = consCanal.newInstance("DevLive", "YouTube", 80.0);
            CanalStream c4 = consCanal.newInstance("PixelArt", "Twitch", 5.0);
            CanalStream c5 = consCanal.newInstance("CodeStream", "Kick", 32.0);

            // Transmisión de horas en c1 usando su método de objeto
            c1.transmitir(3.5);

            // Impresión de estadísticas de cada objeto
            c1.mostrarEstadisticas();
            c2.mostrarEstadisticas();
            c3.mostrarEstadisticas();
            c4.mostrarEstadisticas();
            c5.mostrarEstadisticas();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
