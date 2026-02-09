/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class ParoImpar {
    public static void main(String[] args) {

// importo el Scanner y Creo el objeto entrada para leer datos introducidos por el usuario
        Scanner entrada = new Scanner(System.in);

        // Pido un número al usuario mostrando un mensaje por pantalla
        System.out.print("Por favor, introduzca un número: ");
        int numero = entrada.nextInt(); // Uso int porque es un número entero

        // Compruebo si el número es divisible entre 2
        // Uso if porque necesitamos tomar una decisión
        if (numero % 2 == 0) { // el % calcula el resto de la división
            System.out.println("El número introducido es par");
        } else {
            // Uso else para el caso contrario, cuando no es divisible entre 2
            System.out.println("El número introducido es impar");
        }

    }
}

