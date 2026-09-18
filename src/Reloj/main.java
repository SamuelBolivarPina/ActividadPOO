package Reloj;

public class main {

    public static void mostrarHora(int hora, int minuto, int segundo) {
        System.out.printf("Hora: 02d:02d:02dn", hora, minuto, segundo);
    }

    public static void main(String[] args) {
        int hora1 = 10;
        int minuto1 = 45;
        int segundo1 = 30;

        System.out.println("Formato de Tiempo");
        mostrarHora(hora1, minuto1, segundo1);
    }
}
