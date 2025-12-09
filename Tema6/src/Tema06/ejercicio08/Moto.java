/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio08;

/**
 *
 * @author alumno
 */
    public class Moto extends Vehiculo {
    private boolean haciendoCaballito;

    public Moto(int velocidad) {
        super(velocidad);
        this.haciendoCaballito = false;
    }

    @Override
    public void mostrarMovimiento() {
        System.out.println("La moto está circulando a " + velocidad + " km/h");
    }

    public void hacerCaballito() {
        if (!haciendoCaballito) {
            haciendoCaballito = true;
            System.out.println("La moto está haciendo un caballito. La velocidad aumenta");
            velocidad += 15;
        } else {
            System.out.println("La moto ya está haciendo un caballito");
        }
        }  
        }
        
