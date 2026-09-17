package EquipoDeFutbol;

public class EquipoDeFutbol {
    String nombre;
    String ciudad;
    int puntos;

    public EquipoDeFutbol() {
    }

    public EquipoDeFutbol(String nombre, String ciudad, int puntos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
    }
    public void ganarPartido() {
        this.puntos += 3;
    }
    public void mostrarEstadisticas() {
        System.out.println("Equipo: " + nombre + " | Ciudad: " + ciudad + " | Puntos: " + puntos);
    }
}
