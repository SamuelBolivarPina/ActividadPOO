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
        System.out.println("=== SIMULACIÓN PROCEDIMENTAL: 5 Entidades CanalStream ===");

        String nombre1 = "Tremord", plat1 = "Kick"; double horas1 = 12.5;
        String nombre2 = "ProGamer", plat2 = "Twitch"; double horas2 = 45.0;
        String nombre3 = "DevLive", plat3 = "YouTube"; double horas3 = 80.0;
        String nombre4 = "PixelArt", plat4 = "Twitch"; double horas4 = 5.0;
        String nombre5 = "CodeStream", plat5 = "Kick"; double horas5 = 32.0;

        // Actualización procedimental
        horas1 = transmitirProc(horas1, 3.5);

        mostrarEstadisticasProc(nombre1, plat1, horas1);
        mostrarEstadisticasProc(nombre2, plat2, horas2);
        mostrarEstadisticasProc(nombre3, plat3, horas3);
        mostrarEstadisticasProc(nombre4, plat4, horas4);
        mostrarEstadisticasProc(nombre5, plat5, horas5);
    }
}