/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadsemanal.pkg02;

/**
 *
 * @author helmu
 */
public abstract class Mascota {
    private String nombre;
    private int  edad;
    private boolean vacunado;
    private String especie;

    public Mascota(String nombre, int edad, boolean vacunado, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.vacunado = vacunado;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void mostrarInformacion() {
    String estadoVacunacion = this.vacunado ? "Sí" : "No";

    System.out.println("--- Información de la Mascota ---");
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Especie: " + this.especie);
    System.out.println("Edad: " + this.edad + " años");
    System.out.println("Vacunado: " + estadoVacunacion);
    System.out.println("---------------------------------");
    }
    
    public abstract void hacerSonido();
    
    public void descansar(){
        System.out.println("La mascota esta descansando");
    }
}
