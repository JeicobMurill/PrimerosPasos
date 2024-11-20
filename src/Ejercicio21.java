/**
 *
 * @author Jeicob Murillo
 */
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.print("Introduce el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = scanner.nextDouble();

        // Determinar cuál es el mayor y cuál es el menor
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
            System.out.println("El menor es: " + num2);
        } else if (num1 < num2) {
            System.out.println("El mayor es: " + num2);
            System.out.println("El menor es: " + num1);
        } else {
            System.out.println("Los dos numeros son iguales.");
        }
    }
}
