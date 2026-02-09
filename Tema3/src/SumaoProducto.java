/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SumaoProducto {
    public static void main(String[] args) {

   // importo el Scanner y Creo el objeto entrada para leer datos introducidos por el usuario
        Scanner entrada = new Scanner(System.in);

        // Pido el primer número al usuario
        System.out.print("Por favor, introduzca un numero: ");
        // Uso int porque pide números enteros
        int numero1 = entrada.nextInt();

        // Luego pido el segundo número al usuario
        System.out.print("Ahora, introduzca un segundo numero: ");
        int numero2 = entrada.nextInt();

        // Uso if para comprobar si el primer número es mayor que 10
        if (numero1 > 10) {
            // Si el primer número es mayor que 10, se realiza una multiplicación
            int resultado = numero1 * numero2;
            System.out.println("La operación que se realizó es producto y el resultado es " + resultado);
        // Uso else para el caso contrario, cuando el primer numero no es mayor que 10,
        } else {
            // Si el primer número es 10 o menor, se realiza una suma
            int resultado = numero1 + numero2;
            System.out.println("La operación que se realizó es suma y el resultado es " + resultado);
        }

    }
}

