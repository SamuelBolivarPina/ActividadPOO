package PruebaPOO;

import Samuel.Samuel;
import CanalStream.CanalStream;
import NegocioGalletas.NegocioGalletas;
import java.lang.reflect.Constructor;

public class PruebaPOO {

    public static void main(String[] args) {
        try {
            System.out.println("=== INSTANCIACIÓN DE 5 OBJETOS SIN 'NEW': Samuel ===");
            Constructor<Samuel> consSamuel = Samuel.class.getConstructor(String.class, int.class, String.class, String.class);

            Samuel s1 = consSamuel.newInstance("Samuel", 18, "Universidad de Cartagena", "Ingeniería de Software");
            Samuel s2 = consSamuel.newInstance("Mateo", 19, "Universidad del Norte", "Ingeniería Industrial");
            Samuel s3 = consSamuel.newInstance("Lucas", 20, "Universidad Nacional", "Ingeniería Mecánica");
            Samuel s4 = consSamuel.newInstance("Daniel", 18, "Universidad de Antioquia", "Ingeniería Electrónica");
            Samuel s5 = consSamuel.newInstance("Camilo", 21, "Universidad del Valle", "Ingeniería Civil");

            s1.mostrarPerfil();
            s2.mostrarPerfil();
            s3.mostrarPerfil();
            s4.mostrarPerfil();
            s5.mostrarPerfil();
        }
    }
}
