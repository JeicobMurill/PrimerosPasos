/**
 *
 * @author Jeicob Murillo
 */
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Definir la tasa de cambio (1 euro = 1.1 dólares)
        double tasaDeCambio = 1.1;

        // Pedir al usuario que ingrese una cantidad en euros
        System.out.print("Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();

        // Realizar la conversión a dólares
        double dolares = euros * tasaDeCambio;

        // Mostrar el resultado
        System.out.println(euros + " euros son equivalentes a " + dolares + " dolares.");

    }
}
