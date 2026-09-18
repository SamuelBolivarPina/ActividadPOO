public class CanalStream {
    String nombreCanal;
    String plataforma;
    double horasTransmitidas;
    public CanalStream() {
    }

    public CanalStream(String nombreCanal, String plataforma, double horasTransmitidas) {
        this.nombreCanal = nombreCanal;
        this.plataforma = plataforma;
        this.horasTransmitidas = horasTransmitidas;
    }
    public void transmitir(double horas) {
        if (horas > 0) {
            this.horasTransmitidas += horas;
        }
    }
    public void mostrarEstadisticas() {
        System.out.println("Canal: " + nombreCanal + " | Plataforma: " + plataforma + " | Horas Emitidas: " + horasTransmitidas + " hrs");
    }
}
