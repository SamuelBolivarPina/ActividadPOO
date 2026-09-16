package NotaAcademica;

public class NotaAcademica {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    public NotaAcademica() {
    }
    public NotaAcademica(String asignatura, double nota1, double nota2, double nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double calcularDefinitiva() {
        return (this.nota1 + this.nota2 + this.nota3) / 3.0;
    }
    public void mostrarEstado() {
        double definitiva = calcularDefinitiva();
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Notas: " + nota1 + " | " + nota2 + " | " + nota3);
        System.out.println("Nota Definitiva: " + String.format("%.2f", definitiva));
    }
}
