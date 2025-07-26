/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadsemanal.pkg02;

/**
 *
 * @author helmu
 */
public class Gato extends Mascota{

    public Gato(String nombre, int edad, boolean vacunado, String especie) {
        super(nombre, edad, vacunado, especie);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("!Miau!");
    }
}
