package Figura;

public class main {

    // Método estático procedimental: recibe las variables de AMBAS entidades
    public static double[] absorberArea(double area1, double area2) {
        area1 += area2;
        area2 = 0;
        return new double[]{area1, area2};
    }

    public static void mostrarInfo(String tipo, double area) {
        System.out.println("Figura: " + tipo + " | Área: " + area + " cm²");
    }

    public static void main(String[] args) {
        // Simulación procedimental de dos figuras
        String tipo1 = "Círculo";
        double area1 = 50.0;

        String tipo2 = "Cuadrado";
        double area2 = 20.0;

        System.out.println(" Áreas Iniciales");
        mostrarInfo(tipo1, area1);
        mostrarInfo(tipo2, area2);

        // Absorción de área procedimental
        double[] nuevasAreas = absorberArea(area1, area2);
        area1 = nuevasAreas[0];
        area2 = nuevasAreas[1];

        System.out.println(" Después de combinar áreas");
        mostrarInfo(tipo1, area1);
        mostrarInfo(tipo2, area2);

        /*
          EXPLICACIÓN / CONCLUSIÓN:
         *
          1. En POO: Una instancia de la clase 'Figura' no puede modificar ni leer
             los atributos de otra instancia de forma implícita. Es indispensable
             recibir la referencia del otro objeto como parámetro en el método
             (por ejemplo: 'figura1.absorberArea(figura2)').

          2. En enfoque procedimental: Para operar con los datos de dos entidades
             distintas, se deben enviar explícitamente los valores de ambas al método
             estático, reconfirmando que las variables locales son independientes.
         */
    }
}
