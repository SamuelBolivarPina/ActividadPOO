package Biblioteca;

public class main {

    public static int registrarLibros(int totalActual, int cantidadNuevos) {
        if (cantidadNuevos > 0) {
            return totalActual + cantidadNuevos;
        }
        return totalActual;
    }

    public static void mostrarInfo(String nombre, String direccion, int totalLibros) {
        System.out.println("Biblioteca: " + nombre + " | Dirección: " + direccion + " | Libros: " + totalLibros);
    }

    public static void main(String[] args) {
        String nombre1 = "Biblioteca Central";
        String direccion1 = "Calle 30 # 18-45";
        int totalLibros1 = 2500;

        System.out.println("Información Inicial de la Biblioteca");
        mostrarInfo(nombre1, direccion1, totalLibros1);

        int nuevosLibros = 150;
        totalLibros1 = registrarLibros(totalLibros1, nuevosLibros);

        System.out.println("Después de ingresar " + nuevosLibros + " libros nuevos");
        mostrarInfo(nombre1, direccion1, totalLibros1);
    }
}
