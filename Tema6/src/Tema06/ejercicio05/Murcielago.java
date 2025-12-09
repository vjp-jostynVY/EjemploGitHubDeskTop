/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio05;

/**
 *
 * @author alumno
 */
public class Murcielago extends Mamifero implements Volador {

    private int alturaVuelo;

    public Murcielago(String nombre, String sexo, String color, int edad, int alturaVuelo) {
        super(nombre, sexo, color, edad);
        this.alturaVuelo = alturaVuelo;
    }

    @Override
    public String obtenerMensajeVolador() {
        return "El murciélago es un animal volador";
    }

    @Override
    public void aumentarAlturaVuelo() {
        alturaVuelo += 5;
        System.out.println("El murciélago aumenta su altura de vuelo a " + alturaVuelo + " metros.");
    }

    @Override
    public void bajarAlturaVuelo() {
        alturaVuelo -= 5;
        if (alturaVuelo < 0) alturaVuelo = 0;
        System.out.println("El murciélago baja su altura de vuelo a " + alturaVuelo + " metros.");
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("Altura actual del vuelo: " + alturaVuelo + " metros.");
    }
    }
    
