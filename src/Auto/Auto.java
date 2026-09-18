package Auto;

public class Auto {
    String marca;
    int velocidad;

    public Auto() {
    }

    /*
       CÓDIGO INCORRECTO (Sombra de variables / Variable Shadowing):

      public Auto(String marca, int velocidad) {
          marca = marca;       // Asigna el parámetro a sí mismo, NO al atributo de la clase
          velocidad = velocidad; // El atributo 'this.velocidad' se queda con su valor por defecto (0)
   }
     */

    // --- CÓDIGO CORREGIDO: Se usa 'this' para diferenciar el atributo del parámetro ---
    public Auto(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public void acelerar(int incremento) {
        this.velocidad += incremento;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Velocidad: " + velocidad + " km/h");
    }
}
