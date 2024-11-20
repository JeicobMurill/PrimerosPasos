/**
 *
 * @author Jeicob Murillo
 */
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero
        System.out.print("Introduce un numero entero: ");
        int numero = scanner.nextInt();

        // Imprimir los números impares menores que el número ingresado
        System.out.println("Los numeros impares menores que " + numero + " son:");
        for (int i = 1; i < numero; i += 2) {
            System.out.println(i);
        }

    }
}
