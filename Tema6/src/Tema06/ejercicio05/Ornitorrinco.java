/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio05;

/**
 *
 * @author alumno
 */
public class Ornitorrinco extends Mamifero implements Oviparo {
    private int numHuevos;

    public Ornitorrinco(String nombre, String sexo, String color, int edad, int numHuevos) {
        super(nombre, sexo, color, edad);
        this.numHuevos = numHuevos;
    }

    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamífero ovíparo";
    }

    @Override
    public void ponerHuevo() {
        numHuevos++;
        System.out.println("El ornitorrinco ha puesto un huevo. Total: " + numHuevos);
    }

    @Override
    public void incubarHuevo() {
        if (numHuevos > 0) {
            numHuevos--;
            System.out.println("El ornitorrinco ha incubado un huevo. Total: " + numHuevos);
        } else {
            System.out.println("No hay huevos para incubar.");
        }
    }

    @Override
    public void mostrarNumHuevos() {
        System.out.println("Número de huevos del ornitorrinco: " + numHuevos);
    }
    } 
    
