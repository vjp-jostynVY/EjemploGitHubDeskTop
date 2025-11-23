/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
  import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class scanner {
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Creación de un Servidor:");

    // pido la ram 
    System.out.print("RAM: ");
    int ram = sc.nextInt();

    int disco;
    // hacemos do while a lo siguiente:
    do {
        System.out.print("Capacidad del disco (múltiplo de 5): ");
        disco = sc.nextInt();
    } while (disco % 5 != 0); // si no es multiplo vuelve

    sc.nextLine(); 

    // aqui la lista:
    System.out.println("Modelos disponibles: i5, i7, Ryzen5, Ryzen7");
    System.out.print("Procesador: ");
    String procesador = sc.nextLine(); 

    System.out.print("Tarjeta gráfica: ");
String grafica = sc.nextLine(); // lo mismo que arriba

    double precio;
    // esto es para que el precio no sea 0 o negativo
    do {
        System.out.print("Precio (>0): ");
        precio = sc.nextDouble();
    } while (precio <= 0);

    int monitor;
    // pedimos un numero mayor a 14
    do {
        System.out.print("Tamaño monitor (>14): ");
        monitor = sc.nextInt();
    } while (monitor <= 14);

    sc.nextLine(); // otra vez limpiar porque sino se salta el input

    System.out.print("Modelo de teclado: ");
    String teclado = sc.nextLine();

    // aquí lo mismo que teclado
    System.out.print("Modelo de ratón: ");
    String raton = sc.nextLine();

    // ponemos el orden de los parametros
    Servidor s = new Servidor(ram, disco, procesador, grafica, precio, monitor, teclado, raton);

    // muestro el servidor (esto lo hacemos siempre)
    System.out.println("Datos del servidor:");
    System.out.println(s);
}

}
  

