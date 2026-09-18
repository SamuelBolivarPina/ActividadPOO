package UsuarioSistema;

public class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    public UsuarioSistema() {
    }
    public UsuarioSistema(String nombreUsuario, String clave, boolean activo) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = activo;
    }
    public boolean autenticar(String claveIngresada) {
        return this.activo && this.clave.equals(claveIngresada);
    }
    public void desactivarUsuario() {
        this.activo = false;
    }
    public void mostrarUsuario() {
        String estado = activo ? "Activo" : "Inactivo";
        System.out.println("Usuario: " + nombreUsuario + " | Estado: " + estado);
    }
}
