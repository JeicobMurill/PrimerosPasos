/**
 *
 * @author Jeicob Murillo
 */
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese tres números enteros positivos
        System.out.print("Introduce el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Introduce el tercer numero: ");
        int num3 = scanner.nextInt();

        // Comprobar si los números ingresados son positivos
        if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
            System.out.println("Todos los numeros deben ser enteros positivos.");
        } else {
            // Calcular el menor y el mayor de los tres números
            int mayor = num1;
            int menor = num1;

            if (num2 > mayor) {
                mayor = num2;
            }
            if (num3 > mayor) {
                mayor = num3;
            }

            if (num2 < menor) {
                menor = num2;
            }
            if (num3 < menor) {
                menor = num3;
            }

            // Imprimir el resultado
            System.out.println("El numero mayor es: " + mayor);
            System.out.println("El numero menor es: " + menor);
        }

    }
}
