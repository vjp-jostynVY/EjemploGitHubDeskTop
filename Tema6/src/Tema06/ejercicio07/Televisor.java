/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio07;

/**
 *
 * @author alumno
 */
  public class Televisor implements ControlRemoto {
    private boolean encendido;
    private int canal;
    private int volumen;

    // Constructor
    public Televisor() {
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
    }

    // Métodos propios
    public void mostrarInfo() {
        System.out.println("Televisor - Encendido: " + encendido +
                           ", Canal: " + canal + ", Volumen: " + volumen);
    }

    // Métodos de la interfaz
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Televisor encendido. Canal actual: " + canal);
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            System.out.println("La TV se apagará en 10s");
            encendido = false;
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen--;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen++;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.canal = (int) canal;
            System.out.println("Canal actual: " + this.canal);
        }
        }
        }
