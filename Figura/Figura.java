package Figura;

public class Figura {
    String tipo;
    double area;

    public Figura() {
    }

    public Figura(String tipo, double area) {
        this.tipo = tipo;
        this.area = area;
    }

    /*
      CÓDIGO INCORRECTO (Intentar acceder al atributo de otra figura sin referencia):

      public void combinarArea(double areaExtra) {
          this.area += area; // <--- ERROR: Suma el área sobre sí misma.
                             // No puede acceder al área de la otra figura sin tener su referencia.
      }
     */

    // --- CÓDIGO CORREGIDO: Se pasa la referencia de la otra figura como parámetro ---
    public void absorberArea(Figura otraFigura) {
        this.area += otraFigura.area; // Acceso correcto al atributo de la otra instancia mediante su referencia
        otraFigura.area = 0; // Se actualiza la otra figura
    }

    public void mostrarInfo() {
        System.out.println("Figura: " + tipo + " | Área: " + area + " cm²");
    }
}
