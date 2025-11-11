/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Generar número aleatorio entre 1 y 100
        int numeroSecreto = rand.nextInt(100) + 1;
        int intentos = 0;
        int intentoUsuario = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número entre 1 y 100. ¡Intenta adivinarlo!");

        // Bucle hasta que el usuario adivine el número
        while (intentoUsuario != numeroSecreto) {
            System.out.print("Introduce tu intento: ");
            intentoUsuario = sc.nextInt();
            intentos++;

            if (intentoUsuario < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (intentoUsuario > numeroSecreto) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
                System.out.println("Número de intentos: " + intentos); 
            }
        }
    }
}  

