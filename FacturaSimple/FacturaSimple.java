package FacturaSimple;

public class FacturaSimple {
    int numero;
    String cliente;
    double valor;

    public FacturaSimple() {
    }

    public FacturaSimple(int numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void mostrarFactura() {
        System.out.println("Factura N°: " + numero + " | Cliente: " + cliente + " | Valor Total: $" + valor);
    }
}
