/**
 *
 * @author Jeicob Murillo
 */
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la altura del rectángulo
        System.out.print("Introduce la altura del rectangulo: ");
        double altura = scanner.nextDouble();

        // Pedir al usuario que ingrese la anchura del rectángulo
        System.out.print("Introduce la anchura del rectangulo: ");
        double anchura = scanner.nextDouble();

        // Calcular el área del rectángulo
        double area = altura * anchura;

        // Mostrar el resultado
        System.out.println("El area del rectangulo es: " + area);

    }
}