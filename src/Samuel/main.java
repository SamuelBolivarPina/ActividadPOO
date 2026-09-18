package Samuel;
import java.lang.reflect.Constructor;
public class main {
    // Métodos estáticos procedimentales
    public static int cumplirAnioProc(int edadActual) {
        return edadActual + 1;
    }

    public static void mostrarPerfilProc(String nombre, int edad, String universidad, String carrera) {
        System.out.println("Estudiante: " + nombre + " | Edad: " + edad + " años");
        System.out.println("Universidad: " + universidad + " | Carrera: " + carrera);
    }

    public static void main(String[] args) {
        try {
            // =========================================================
            // 1. DEMOSTRACIÓN POO: 5 Objetos de Samuel (SIN 'new')
            // =========================================================
            System.out.println("=== 5 OBJETOS CLASE: Samuel (POO - Sin 'new') ===");
            Constructor<Samuel> consSamuel = Samuel.class.getConstructor(String.class, int.class, String.class, String.class);

            Samuel s1 = consSamuel.newInstance("Samuel", 18, "Universidad de Cartagena", "Ingeniería de Software");
            Samuel s2 = consSamuel.newInstance("Mateo", 19, "Universidad del Norte", "Ingeniería Industrial");
            Samuel s3 = consSamuel.newInstance("Lucas", 20, "Universidad Nacional", "Ingeniería Mecánica");
            Samuel s4 = consSamuel.newInstance("Daniel", 18, "Universidad de Antioquia", "Ingeniería Electrónica");
            Samuel s5 = consSamuel.newInstance("Camilo", 21, "Universidad del Valle", "Ingeniería Civil");

            // Modificación de estado en POO
            s1.cumplirAnio();
        }
    }
}