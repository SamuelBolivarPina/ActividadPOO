package Reloj;

public class Reloj {
    int hora;
    int minuto;
    int segundo;

    public Reloj() {
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostrarHora() {
        System.out.printf("Hora: %02d:%02d:%02d%n", hora, minuto, segundo);
    }
}
