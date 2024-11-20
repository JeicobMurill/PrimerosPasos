/**
 *
 * @author Jeicob Murillo
 */
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Pedir al usuario que ingrese una temperatura en Fahrenheit
            System.out.print("Introduce la temperatura en grados Fahrenheit (999 para finalizar): ");
            double fahrenheit = scanner.nextDouble();

            // Verificar si el usuario quiere finalizar el programa
            if (fahrenheit == 999) {
                System.out.println("Programa finalizado.");
                break; // Finaliza el programa si el valor es 999
            }

            // Convertir la temperatura de Fahrenheit a Celsius
            double celsius = 5.0 / 9.0 * (fahrenheit - 32);

            // Mostrar el resultado
            System.out.println("La temperatura en grados Celsius es: " + celsius);
        }

    }
}
