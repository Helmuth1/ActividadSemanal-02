/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadsemanal.pkg02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author helmu
 */
public class ConsultaVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Mascota> mascotas = new ArrayList<>();
        
        Perro p1 = new Perro("Teddy", 3, false, "perro");
        mascotas.add(p1);
        
        Gato g1 = new Gato("Tom", 2, false, "gato");
        mascotas.add(g1);
        
        Conejo c1 = new Conejo("Bugs Bunny", 1, true, "Conejo");
        mascotas.add(c1);
        
        Tortuga t1 = new Tortuga("Bugs Bunny", 1, true, "Conejo");
        mascotas.add(t1);
        
            for (Mascota m : mascotas) {
            m.mostrarInformacion();
            m.hacerSonido();
            m.descansar();
            
            if (m instanceof AtencionEspecial) {
            ((AtencionEspecial) m ).recibirAtencionEspecial();
        }
        }
    }
    
}
