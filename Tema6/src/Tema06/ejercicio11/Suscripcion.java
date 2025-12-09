/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio11;

/**
 *
 * @author alumno
 */
   public abstract class Suscripcion {
    protected float precioBase;

    public Suscripcion(float precioBase) {
        this.precioBase = precioBase;
    }

    public abstract float calcularPrecio();

    public float getPrecioBase() {
        return precioBase;
    }
    }


