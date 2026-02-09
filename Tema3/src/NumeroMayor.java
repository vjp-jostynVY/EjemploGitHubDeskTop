/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NumeroMayor {
    public static void main(String[] args) {
        // importo el Scanner y Creo el objeto entrada para leer datos introducidos por el usuario
        Scanner entrada = new Scanner(System.in);

        // Pido el primer número mostrando el mensaje por pantalla
        System.out.print("Por favor, introduzca el primer numero: ");
        int numero1 = entrada.nextInt(); // Uso int int porque son números enteros

        // Pido el segundo número mostrando mensaje por pantalla
        System.out.print("Ahora, introduzca un segundo numero: ");
        int numero2 = entrada.nextInt();

        // y Pido el tercer numero mostrando el mensaje por pantalla
        System.out.print("Por último, introduzca un tercer numero: ");
        int numero3 = entrada.nextInt();

  // Inicializo la variable mayor con el primer numero para poder comprobarlo con los otros.
        int mayor = numero1;

       // Comprobamos si numero2 es mayor que el mayor actual
  // Uso if porque solo quiero actualizar mayor si se cumple la condición
        if (numero2 > mayor) {
            mayor = numero2; // actualizamos el mayor
        }

        // Comprobamos si numero3 es mayor que el mayor actual
   // Uso if porque debemos comparar este número también
        if (numero3 > mayor) {
            mayor = numero3; // actualizamos el mayor
        }

        // Por ultimo muestro por pantalla cual es el número mayor
        System.out.println("El número mayor de los introducidos es el " + mayor);
    }
}

