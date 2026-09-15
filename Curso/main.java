package Curso;

public class main {

    public static void mostrarInfo(String nombre, int codigo) {
        System.out.println("Curso: " + nombre + " | Código: " + codigo);
    }

    public static void main(String[] args) {
        // --- Simulación de dos "objetos" Curso (Sin 'new') ---

        // Objeto 1
        String nombreCurso1 = "Programación Orientada a Objetos";
        int codigoCurso1 = 101;

        // Objeto 2
        String nombreCurso2 = "Bases de Datos";
        int codigoCurso2 = 102;

        System.out.println("=== Curso 1 ===");
        mostrarInfo(nombreCurso1, codigoCurso1);

        System.out.println("\n=== Curso 2 ===");
        mostrarInfo(nombreCurso2, codigoCurso2);

        /*
         * EXPLICACIÓN / CONCLUSIÓN:

         Ambos objetos pertenecen a la misma clase 'Curso' porque comparten exactamente
         la misma estructura (los atributos 'nombre' y 'codigo') y los mismos comportamientos
         o funcionalidades (el método 'mostrarInfo').

         La clase actúa como el plano o plantilla general que define QUÉ propiedades tiene
         un curso, mientras que los datos o valores concretos (como "POO" o "Bases de Datos")
         representan el ESTADO específico de cada instancia u objeto individual.
         */
    }
}
