public class CuentaBancaria {
    String titular;
    String numero;
    double saldo;
    void mostrarCuenta(){
        System.out.println("Titular: " + titular);
        System.out.println("numero: " + numero);
        System.out.println("Saldo" + saldo);
    }
    void consignar(double valor){
        saldo += valor;
    }
    void retirar(double valor){
    if(saldo >= valor){
        saldo -= valor;
    }
    else{
        System.out.println("saldo insuficiente.");
        }
    }
}
