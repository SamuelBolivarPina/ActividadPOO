package UsuarioSistema;

public class main {

    public static boolean autenticar(String clave, boolean activo, String claveIngresada) {
        return activo && clave.equals(claveIngresada);
    }

    public static boolean desactivarUsuario(boolean activo) {
        return false;
    }

    public static void mostrarUsuario(String nombreUsuario, boolean activo) {
        String estado = activo ? "Activo" : "Inactivo";
        System.out.println("Usuario: " + nombreUsuario + " | Estado: " + estado);
    }

    public static void main(String[] args) {
        String nombreUsuario1 = "admin_dev";
        String clave1 = "Pass1234";
        boolean activo1 = true;

        System.out.println("Detalle del Usuario");
        mostrarUsuario(nombreUsuario1, activo1);

        boolean inicioExitoso = autenticar(clave1, activo1, "Pass1234");
        System.out.println("Intento de inicio de sesión: " + (inicioExitoso ? "Exitoso" : "Fallido"));

        activo1 = desactivarUsuario(activo1);

        System.out.println("Estado Después de Desactivar");
        mostrarUsuario(nombreUsuario1, activo1);
    }
}
