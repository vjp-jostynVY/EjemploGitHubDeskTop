/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio08;

/**
 *
 * @author alumno
 */
    public class Coche extends Vehiculo {
    private boolean aireEncendido;

    public Coche(int velocidad) {
        super(velocidad);
        this.aireEncendido = false;
    }

    @Override
    public void mostrarMovimiento() {
        System.out.println("El coche está circulando a " + velocidad + " km/h");
    }

    public void encenderAire() {
        if (!aireEncendido) {
            aireEncendido = true;
            System.out.println("El coche ha encendido el aire. La velocidad se reduce");
            velocidad -= 10;
        } else {
            System.out.println("El aire ya está encendido");
        }
        }
        }
        