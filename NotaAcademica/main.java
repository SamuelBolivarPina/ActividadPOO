package NotaAcademica;

public class main {

    public static double calcularDefinitiva(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public static void mostrarEstado(String asignatura, double nota1, double nota2, double nota3) {
        double definitiva = calcularDefinitiva(nota1, nota2, nota3);
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Notas: " + nota1 + " | " + nota2 + " | " + nota3);
        System.out.println("Nota Definitiva: " + String.format("%.2f", definitiva));
    }
    public static void main(String[] args) {

        String asignatura1 = "Programación Orientada a Objetos";
        double nota1_1 = 4.5;
        double nota2_1 = 3.8;
        double nota3_1 = 4.2;

        System.out.println("=== Reporte Académico ===");
        mostrarEstado(asignatura1, nota1_1, nota2_1, nota3_1);
    }
}
