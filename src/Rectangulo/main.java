package Rectangulo;

public class main {


    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void mostrarResultados(double base, double altura) {
        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        System.out.println("Base: " + base + " cm | Altura: " + altura + " cm");
        System.out.println("Área: " + area + " cm²");
        System.out.println("Perímetro: " + perimetro + " cm");
    }

    public static void main(String[] args) {
        double base1 = 5.0;
        double altura1 = 3.0;

        System.out.println("Resultados del Rectángulo");
        mostrarResultados(base1, altura1);
    }
}
