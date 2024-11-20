/**
 *
 * @author Jeicob Murillo
 */
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero
        System.out.print("Introduce un numero entero: ");
        int numero = scanner.nextInt();

        // Variable para almacenar la suma
        int suma = 0;

        // Sumar los 100 números siguientes
        for (int i = numero + 1; i <= numero + 100; i++) {
            suma += i; // Sumar cada número
        }

        // Mostrar el resultado
        System.out.println("La suma de los 100 numeros siguientes a " + numero + " es: " + suma);

    }
}
