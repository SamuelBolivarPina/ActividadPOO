package Estudiante;
public class Main {
    public static void mostrarEstudiante(String nombre, String codigo, int semestre) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
    }
        // Estudiante 1
        public static void main(String[] args) {
            // Estudiante 1 (Simulación con todos los datos)
            String nombre1 = "Samuel";
            String codigo1 = "7502610043";
            int semestre1 = 2;

            String nombre2 = "María";
            String codigo2 = "7502610088";
            int semestre2 = 3;

            String nombre3 = "Carlos";
            String codigo3 = "7502610099";
            int semestre3 = 5;

            System.out.println("--- Estudiante 1 ---");
            mostrarEstudiante(nombre1, codigo1, semestre1);

            System.out.println("--- Estudiante 2 ---");
            mostrarEstudiante(nombre2, codigo2,semestre2);

            System.out.println("--- Estudiante 3 ---");
            mostrarEstudiante(nombre3,codigo3,semestre3);
    }
}
