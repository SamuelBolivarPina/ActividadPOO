package CuentaBancaria;

public class main {

    public static void mostrarCuenta(String titular, String numero, double saldo) {
        System.out.println("Titular: " + titular);
        System.out.println("Número de Cuenta: " + numero);
        System.out.println("Saldo: $" + saldo);
    }

    public static void main(String[] args) {
        // Datos de la Cuenta 1
        String titular1 = "Juan Pérez";
        String numero1 = "123456789";
        double saldo1 = 1500000.0;

        // Datos de la Cuenta 2
        String titular2 = "María Gómez";
        String numero2 = "987654321";
        double saldo2 = 3200000.0;

        // Mostrar Cuenta 1
        System.out.println("--- Cuenta Bancaria 1 ---");
        mostrarCuenta(titular1, numero1, saldo1);

        System.out.println();

        // Mostrar Cuenta 2
        System.out.println("Cuenta Bancaria 2");
        mostrarCuenta(titular2, numero2, saldo2);
    }
}