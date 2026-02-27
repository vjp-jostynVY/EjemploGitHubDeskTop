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
public class Ejercicio21 {
    public static void main(String[] args) {
       // Creo el objeto Scanner para que el usuario pueda escribir números
        Scanner entrada = new Scanner(System.in); 
        
        // Uso try para intentar hacer la división.
        try { 
            // Si ocurre un error, el programa no se detiene y pasa al catch.
            System.out.print("Ingresa el primer numero: ");
            int num1 = entrada.nextInt(); 
       // nextInt() lo uso para guardar el número entero que el usuario escribe. 
       
            System.out.print("Ingresa el segundo numero (divisor): ");
            int num2 = entrada.nextInt(); 
            // Este será el número por el que vamos a dividir
            
            int resultado = num1 / num2; // Aquí hago la división

            // Imprimo el resultado en pantalla
            System.out.println("El resultado es: " + resultado);
            
        } catch (ArithmeticException e) {
            // Este catch se ejecuta si el usuario intenta dividir entre 0
            
            System.out.println("Error: No se puede dividir entre 0.");
            // Muestro un mensaje de error en pantalla
            
        } catch (Exception e) {
            // Este catch se ejecuta si el usuario escribe algo que no es un número
            System.out.println("Error: Debes ingresar solo numeros enteros.");
        }
     }
  }

