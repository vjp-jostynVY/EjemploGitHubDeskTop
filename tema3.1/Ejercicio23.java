/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        // Creo el objeto Scanner para poder leer lo que escribe el usuario
        Scanner entrada = new Scanner(System.in);

        // Declaro la variable donde guardaremos el número
        int numero; //Uso int porque trabajaremos con numeros enteros

        // Pedimos el número al usuario
        System.out.println("Introduce un número mayor que 1:");
        numero = entrada.nextInt(); //Guardamos en la variable numero lo que escribe el usuario

        // Uso while porque necesito repetir algo mientras se cumpla una condición.
        // Mientras el número sea menor o igual que 1, seguimos pidiéndolo
        while (numero <= 1) {
            // Imprimo este mensaje para avisar que el número es incorrecto
            System.out.println("Error. El número debe ser mayor que 1.");
            // Vuelvo a pedir el número
            System.out.println("Vuelve a introducir un número mayor que 1:");
            numero = entrada.nextInt(); // Leo otra vez el número
        }
         
        // Uso for porque sé exactamente cuántas veces quiero repetir algo.
        // Quiero imprimir desde 1 hasta el número que ha introducido el usuario.
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);   // Imprimo cada número por pantalla
        }
    }
}
