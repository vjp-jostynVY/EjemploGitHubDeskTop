/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio08;

/**
 *
 * @author alumno
 */
    public class Test {

    public static void procesarVehiculo(Vehiculo vehiculo) {
        // Mostrar movimiento inicial
        vehiculo.mostrarMovimiento();

        // Comprobar si es coche
        if (vehiculo instanceof Coche) {
            Coche coche = (Coche) vehiculo;
            coche.encenderAire();
            coche.mostrarMovimiento();
        }

        // Comprobar si es moto
        if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            moto.hacerCaballito();
            moto.mostrarMovimiento();
        }
    }

    public static void main(String[] args) {
        Coche coche = new Coche(60);
        Moto moto = new Moto(40);

        System.out.println("---- Procesando coche ----");
        procesarVehiculo(coche);

        System.out.println("\n---- Procesando moto ----");
        procesarVehiculo(moto);
    }
    }
    
