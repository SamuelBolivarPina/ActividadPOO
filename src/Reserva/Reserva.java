package Reserva;

public class Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;

    public Reserva() {
    }

    public Reserva(String nombreCliente, String fecha, boolean activa) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = activa;
    }

    public void cancelarReserva() {
        this.activa = false;
    }

    public void mostrarReserva() {
        String estado = activa ? "Activa" : "Cancelada";
        System.out.println("Cliente: " + nombreCliente + " | Fecha: " + fecha + " | Estado: " + estado);
    }
}
