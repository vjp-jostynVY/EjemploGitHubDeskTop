/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio07;

/**
 *
 * @author alumno
 */
    public class Test {
    public static void main(String[] args) {
        // Probando Televisor
        Televisor tv = new Televisor();
        tv.encender();
        tv.mostrarInfo();
        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();
        tv.mostrarInfo();
        tv.cambiarCanal(5);
        tv.bajarVolumen();
        tv.apagar();
        tv.mostrarInfo();

        System.out.println("--------------------");

        // Probando Radio
        Radio radio = new Radio();
        radio.encender();
        radio.mostrarInfo();
        radio.subirVolumen();
        radio.subirVolumen();
        radio.subirVolumen();
        radio.mostrarInfo();
        radio.cambiarCanal(101.5f);
        radio.bajarVolumen();
        radio.apagar();
        radio.mostrarInfo();
    }
    }

