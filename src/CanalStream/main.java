package CanalStream;

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
}
