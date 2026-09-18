package Rectangulo;

public class Rectangulo {
    double base;
    double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }

    public void mostrarResultados() {
        System.out.println("Base: " + base + " cm | Altura: " + altura + " cm");
        System.out.println("Área: " + calcularArea() + " cm²");
        System.out.println("Perímetro: " + calcularPerimetro() + " cm");
    }
}
