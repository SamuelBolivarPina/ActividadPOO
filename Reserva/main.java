package Reserva;

public class main {

    public static boolean cancelarReserva(boolean activa) {
        return false; // Cambia el estado a inactivo
    }

    public static void mostrarReserva(String nombreCliente, String fecha, boolean activa) {
        String estado = activa ? "Activa" : "Cancelada";
        System.out.println("Cliente: " + nombreCliente + " | Fecha: " + fecha + " | Estado: " + estado);
    }

    public static void main(String[] args) {
        // Simulación procedimental de la reserva (Sin 'new')
        String nombreCliente1 = "Carlos Gómez";
        String fecha1 = "20/10/2026";
        boolean activa1 = true;

        System.out.println("Estado Inicial de la Reserva");
        mostrarReserva(nombreCliente1, fecha1, activa1);

        activa1 = cancelarReserva(activa1);

        System.out.println("Estado Después de Cancelar");
        mostrarReserva(nombreCliente1, fecha1, activa1);
    }
}
