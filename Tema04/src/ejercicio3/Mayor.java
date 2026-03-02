/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class Mayor {
    // Método que recibe tres números enteros
    // y devuelve el mayor de ellos
    public int obtenerMayor(int a, int b, int c) {

        // Suponemos que el primer número es el mayor
        int mayor = a;

        // Comprobamos si el segundo número es mayor
        if (b > mayor) {
            mayor = b;
        }

        // Comprobamos si el tercer número es mayor
        if (c > mayor) {
            mayor = c;
        }

        // Devolvemos el número mayor encontrado
        return mayor;
    }
}
