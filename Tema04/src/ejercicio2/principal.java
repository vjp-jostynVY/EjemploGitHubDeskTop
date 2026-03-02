/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class principal {
    // Método principal: es el que se ejecuta al iniciar el programa
    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        // Pedimos el primer número
        System.out.print("Por favor, introduzca un numero: ");
        int num1 = sc.nextInt(); // Guardamos el primer número

        // Pedimos el segundo número
        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = sc.nextInt(); // Guardamos el segundo número

        // Creamos un objeto de la clase Operaciones
        operaciones op = new operaciones();

        int resultado;      // Variable para guardar el resultado
        String operacion;   // Variable para guardar el tipo de operación

        // Condición: si el primer número es mayor que 10
        if (num1 > 10) {

            // Llamamos al método multiplicar de la otra clase
            resultado = op.multiplicar(num1, num2);
            operacion = "producto";

        } else {

            // Si no es mayor que 10, llamamos al método sumar
            resultado = op.sumar(num1, num2);
            operacion = "suma";
        }

        // Mostramos la operación realizada y el resultado
        System.out.println("La operación que se realizó es "
                + operacion + " y el resultado es " + resultado);;
    }
}

