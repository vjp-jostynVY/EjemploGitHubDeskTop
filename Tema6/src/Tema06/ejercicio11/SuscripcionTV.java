/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio11;

/**
 *
 * @author alumno
 */
    public class SuscripcionTV extends Suscripcion {

    public SuscripcionTV(float precioBase) {
        super(precioBase);
    }

    @Override
    public float calcularPrecio() {
        return precioBase * 1.21f;
    }
    }


