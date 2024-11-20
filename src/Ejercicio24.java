/**
 *
 * @author Jeicob Murillo
 */
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los coeficientes a, b y c
        System.out.print("Introduce el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Introduce el valor de c: ");
        double c = scanner.nextDouble();

        // Calcular el discriminante
        double discriminante = b * b - 4 * a * c;

        // Estudiar el discriminante para determinar las soluciones
        if (discriminante > 0) {
            // Si el discriminante es mayor que 0, hay dos soluciones reales distintas
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            // Si el discriminante es igual a 0, hay una solución real doble
            double x = -b / (2 * a);
            System.out.println("La solución es: x = " + x);
        } else {
            // Si el discriminante es menor que 0, no hay soluciones reales
            System.out.println("La ecuación no tiene soluciones reales.");
        }

    }
}
