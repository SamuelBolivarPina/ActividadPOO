package Computador;

public class Computador {
    String marca;
    String procesador;
    int ramGB;

    public Computador() {
    }

    public Computador(String marca, String procesador, int ramGB) {
        this.marca = marca;
        this.procesador = procesador;
        this.ramGB = ramGB;
    }

    public void mostrarEspecificaciones() {
        System.out.println("Marca: " + marca + " | Procesador: " + procesador + " | RAM: " + ramGB + "GB");
    }
}

/*
 EXPLICACIÓN / CONCLUSIÓN:

 1. Plano Conceptual (La Clase 'Computador'):
 Es la estructura abstracta o diseño teórico. Define qué características
 tendrá cualquier computador (atributos: 'marca', 'procesador', 'ramGB')
 y qué acciones podrá realizar (métodos), pero no ocupa espacio operativo
 con datos reales de ningún computador específico.

 2. Máquina Concreta (El Objeto/Instancia):
 Es la manifestación física o tangible en memoria construida a partir del plano.
 Posee valores reales específicos asignados a esos atributos (ejemplo: marca="Asus",
 procesador="Intel Core i7", ramGB=16) y representa una entidad funcional única.
 */
