package EquipoDeFutbol;
/*
Análisis Previo
Atributos:

nombre (String): Nombre del equipo.

ciudad (String): Ciudad de origen o sede del club.

puntos (int): Puntos acumulados en el torneo.

Métodos:

ganarPartido(): Incrementa en 3 la cantidad de puntos del equipo.

mostrarEstadisticas(): Imprime el nombre, ciudad y puntaje actual.

Objetos reales que podrían construirse:

equipo1: "Real Cartagena", ciudad "Cartagena", 24 puntos.

equipo2: "Junior", ciudad "Barranquilla", 30 puntos.
 */
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
