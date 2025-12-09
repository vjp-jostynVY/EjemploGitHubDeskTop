/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio05;

/**
 *
 * @author alumno
 */
public class Test {
   public static void main(String[] args) {

        System.out.println("=== PRUEBA DIRECTA DE OBJETOS ===");

        Ornitorrinco o = new Ornitorrinco("Perry", "Macho", "Marrón", 5, 2);
        Murcielago m = new Murcielago("Batty", "Hembra", "Negro", 3, 10);

        o.mostrarDatos();
        System.out.println(o.obtenerMensajeOviparo());
        o.mostrarNumHuevos();
        o.ponerHuevo();
        o.incubarHuevo();

        System.out.println();
        m.mostrarDatos();
        System.out.println(m.obtenerMensajeVolador());
        m.mostrarAlturaVuelo();
        m.aumentarAlturaVuelo();
        m.bajarAlturaVuelo();


        System.out.println("\n=== PRUEBA CON POLIMORFISMO ===");

        // Polimorfismo con Oviparo
        Oviparo oviparo = new Ornitorrinco("Ovi", "Hembra", "Beige", 4, 1);
        System.out.println(oviparo.obtenerMensajeOviparo());
        oviparo.ponerHuevo();
        oviparo.mostrarNumHuevos();

        // Polimorfismo con Volador
        Volador volador = new Murcielago("Drako", "Macho", "Gris", 2, 15);
        System.out.println(volador.obtenerMensajeVolador());
        volador.mostrarAlturaVuelo();
        volador.aumentarAlturaVuelo();
        volador.bajarAlturaVuelo();
    }
    }
    
