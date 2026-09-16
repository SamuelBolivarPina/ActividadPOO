package Temperatura;

public class main {

    public static double aFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void mostrarConversion(double celsius) {
        double fahrenheit = aFahrenheit(celsius);
        System.out.println("Temperatura: " + celsius + " °C | " + fahrenheit + " °F");
    }
    public static void main(String[] args) {
        double celsius1 = 25.0;

        System.out.println("Conversión de Temperatura");
        mostrarConversion(celsius1);
    }
}