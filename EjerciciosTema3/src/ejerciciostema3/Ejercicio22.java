/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciostema3;
import java.util.Scanner; 
/**
 *
 * @author alumno
 */
public class Ejercicio22 {
    public static void main(String[] args) {
      // Creo el objeto Scanner para recibir datos desde el teclado.
        Scanner entrada = new Scanner(System.in); 

        try { // Uso try para intentar hacer la suma.
            // Si el usuario escribe algo que no es un número, el error se enviará al catch.

            System.out.print("Ingresa el primer numero: ");
            int num1 = entrada.nextInt();  
            // Uso int porque quiero trabajar con números enteros sin decimales.
            // nextInt() permite guardar ese número entero en la variable.

            System.out.print("Ingresa el segundo numero: ");
            int num2 = entrada.nextInt();  
            // También uso int aquí porque seguimos trabajando con enteros.

            int resultado = num1 + num2;  // Realizo la suma de los dos números.

            System.out.println("La suma es: " + resultado);
            // Imprimo el resultado en pantalla.

        } catch (Exception e) {
            // Este catch se ejecuta si el usuario escribe letras en vez de números.
            System.out.println("Error: Debes ingresar solo numeros enteros.");
        }
    }
} 

