public class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;
            void mostrarEstado(){
                System.out.println("Marca" + marca);
                System.out.println("Modelo" + modelo);
                System.out.println("Velocidad Actual" + velocidadActual + "km/h");
    }
            void acelerar() {
                velocidadActual += 10;
            }
    void frenar(){
        if(velocidadActual<=10){
            velocidadActual-=10;
        }
        else {
            velocidadActual = 0;
        }
    }
}

