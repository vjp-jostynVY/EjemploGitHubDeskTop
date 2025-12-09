/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio04;

/**
 *
 * @author alumno
 */
public class Perro extends Canido {

    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String mostrarSonido() {
        return "Ladrido";
    }

    @Override
    public String mostrarAlimentacion() {
        return "Carnívora";
    }

    @Override
    public String mostrarHabitat() {
        return "Doméstico";
    }

    @Override
    public String mostrarNombreCientifico() {
        return "Canis lupus familiaris";
    }
    }
    
 

