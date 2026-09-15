package Auto;

public class main {

    /*
       EQUIVALENTE PROCEDIMENTAL DEL ERROR DE ÁMBITO:

      public static void actualizarVelocidad(int velocidad) {
          int velocidad = 50; // Error de compilación: 'variable velocidad is already defined'
     }
     */

    // Método estático para mostrar la información
    public static void mostrarInfo(String marca, int velocidad) {
        System.out.println("Marca: " + marca + " | Velocidad: " + velocidad + " km/h");
    }

    public static void main(String[] args) {
        // Simulación procedimental del automóvil
        String marca1 = "Toyota";
        int velocidad1 = 80;

        System.out.println("=== Estado del Auto ===");
        mostrarInfo(marca1, velocidad1);

        /*
          EXPLICACIÓN / CONCLUSIÓN:

          1. En POO: Cuando un parámetro o variable local tiene el mismo nombre que un
             atributo de la clase, se produce "Variable Shadowing" (sombras de variables).
             La variable local tiene prioridad sobre el atributo. Para romper esta ambigüedad
             y referenciar explícitamente el atributo de la instancia, se debe utilizar 'this'.

          2. En enfoque procedimental: Las variables locales solo existen dentro del bloque { }
             donde fueron declaradas (scope). Intentar redefinir un parámetro como variable local
             dentro del mismo método causa un error directo de compilación por duplicación de nombres.
         */
    }
}
