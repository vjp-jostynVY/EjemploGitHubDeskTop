/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema06.ejercicio11;

/**
 *
 * @author alumno
 */
    public interface Pagable {

    float pagoTarjeta();   // +5€
    float pagoEfectivo();  // sin comisión
    float pagoPaypal();    // +3%

    void procesarPago();
   }


