package CanalStream;

public class main {
    public static double transmitirProc(double horasActuales, double horasNuevas) {
        if (horasNuevas > 0) {
            return horasActuales + horasNuevas;
        }
        return horasActuales;
    }
}
