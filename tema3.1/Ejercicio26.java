/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        // Uso int porque trabajamos con números enteros
        int suma = 0;  // Esta variable guardará la suma total
        
        // Uso for porque sé exactamente el rango que quiero recorrer
        // Desde 111 hasta 222
        for (int i = 111; i <= 222; i++) {

            // Uso if para comprobar si el número es impar
            // Un número es impar cuando al dividirlo entre 2 el resto es distinto de 0
            if (i % 2 != 0) {

                suma = suma + i;  
                // Voy acumulando los números impares en la variable suma
            }
        }

        // Muestro el resultado por pantalla
        System.out.println("La suma total de los números impares entre 111 y 222 es: " + suma);
        // Uso println para mostrar el resultado al usuario
    }
}

