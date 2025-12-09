/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio07;

/**
 *
 * @author alumno
 */
    public class Radio implements ControlRemoto {
    private boolean encendido;
    private float emisora;
    private int volumen;

    // Constructor
    public Radio() {
        this.encendido = false;
        this.emisora = 80.0f;
        this.volumen = 15;
    }

    // Métodos propios
    public void mostrarInfo() {
        System.out.println("Radio - Encendido: " + encendido +
                           ", Emisora: " + emisora + ", Volumen: " + volumen);
    }

    // Métodos de la interfaz
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Radio encendida.");
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("Radio apagada.");
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen -= 5;
            System.out.println("Volumen actual: " + volumen);
        }
        }

    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen += 5;
            System.out.println("Volumen actual: " + volumen);
        }
        }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            emisora = canal;
            System.out.println("Emisora actual: " + emisora);
        }
        }
        }
