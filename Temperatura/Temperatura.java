package Temperatura;

public class Temperatura {
    double celsius;

    public Temperatura() {
    }
    public Temperatura(double celsius) {
        this.celsius = celsius;
    }
    public double aFahrenheit() {
        return (this.celsius * 9 / 5) + 32;
    }
    public void mostrarConversion() {
        System.out.println("Temperatura: " + celsius + " °C | " + aFahrenheit() + " °F");
    }
}
