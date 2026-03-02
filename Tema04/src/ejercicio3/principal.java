/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class principal {
    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer números desde teclado
        Scanner sc = new Scanner(System.in);

        // Solicitamos el primer número al usuario
        System.out.print("Por favor, introduzca el primer numero: ");
        int num1 = sc.nextInt();

        // Solicitamos el segundo número
        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = sc.nextInt();

        // Solicitamos el tercer número
        System.out.print("Por último, introduzca un tercer numero: ");
        int num3 = sc.nextInt();

        // Creamos un objeto de la clase Mayor (que está en otro paquete)
        Mayor mayor = new Mayor();

        // Llamamos al método obtenerMayor y guardamos el resultado
        int resultado = mayor.obtenerMayor(num1, num2, num3);

        // Mostramos el resultado por pantalla
        System.out.println("El número mayor de los introducidos es el " + resultado);

     
    }
}