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

            s1.mostrarPerfil();
            System.out.println("---");
            s2.mostrarPerfil();
            System.out.println("---");
            s3.mostrarPerfil();
            System.out.println("---");
            s4.mostrarPerfil();
            System.out.println("---");
            s5.mostrarPerfil();

        } catch (Exception e) {
            e.printStackTrace();
        }

    System.out.println("=== SIMULACIÓN PROCEDIMENTAL: 5 Entidades Samuel ===");

    String nombre1 = "Samuel", uni1 = "Universidad de Cartagena", carrera1 = "Ingeniería de Software"; int edad1 = 18;
    String nombre2 = "Mateo", uni2 = "Universidad del Norte", carrera2 = "Ingeniería Industrial"; int edad2 = 19;
    String nombre3 = "Lucas", uni3 = "Universidad Nacional", carrera3 = "Ingeniería Mecánica"; int edad3 = 20;
    String nombre4 = "Daniel", uni4 = "Universidad de Antioquia", carrera4 = "Ingeniería Electrónica"; int edad4 = 18;
    String nombre5 = "Camilo", uni5 = "Universidad del Valle", carrera5 = "Ingeniería Civil"; int edad5 = 21;

        // Actualización procedimental
        edad1 = cumplirAnioProc(edad1);

        mostrarPerfilProc(nombre1, edad1, uni1, carrera1);
        System.out.println("---");
        mostrarPerfilProc(nombre2, edad2, uni2, carrera2);
        System.out.println("---");
        mostrarPerfilProc(nombre3, edad3, uni3, carrera3);
        System.out.println("---");
        mostrarPerfilProc(nombre4, edad4, uni4, carrera4);
        System.out.println("---");
        mostrarPerfilProc(nombre5, edad5, uni5, carrera5);
    }
}



