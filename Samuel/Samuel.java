public class Samuel {
    String nombre;
    int edad;
    String universidad;
    String carrera;

    public Samuel() {
    }

    public Samuel(String nombre, int edad, String universidad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
        this.carrera = carrera;
    }

    public void cumplirAnio() {
        this.edad += 1;
    }
    public void mostrarPerfil() {
        System.out.println("Estudiante: " + nombre + " | Edad: " + edad + " años");
        System.out.println("Universidad: " + universidad + " | Carrera: " + carrera);
    }
}
