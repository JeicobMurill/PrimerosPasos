/**
 *
 * @author Jeicob Murillo
 */
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.print("Introduce el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();

        // Calcular el GCD usando el algoritmo de Euclides
        int gcd = calcularGCD(num1, num2);

        // Mostrar el resultado
        System.out.println("El GCD de " + num1 + " y " + num2 + " es: " + gcd);

    }

    // Método que implementa el algoritmo de Euclides para calcular el GCD
    public static int calcularGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // Resto de la división
            a = temp;  // El valor de b pasa a ser el nuevo a
        }
        return a; // El GCD es el valor final de a
    }
}