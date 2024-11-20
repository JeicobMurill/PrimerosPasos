/**
 *
 * @author Jeicob Murillo
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        // Inicializar el resultado en 1
        long resultado = 1;

        // Multiplicar los primeros 20 números naturales
        for (int i = 1; i <= 20; i++) {
            resultado *= i; // Multiplica el número actual con el resultado
        }

        // Imprimir el resultado final
        System.out.println("El resultado de multiplicar los primeros 20 numeros naturales es: " + resultado);
    }
}
