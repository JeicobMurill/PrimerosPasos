/**
 *
 * @author Jeicob Murillo
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        // Variable para almacenar la suma de los cuadrados
        long sumaDeCuadrados = 0;

        // Sumar los cuadrados de los primeros 100 números naturales
        for (int i = 1; i <= 100; i++) {
            sumaDeCuadrados += i * i; // Sumar el cuadrado de cada número
        }

        // Imprimir el resultado final
        System.out.println("La suma de los cuadrados de los 100 primeros numeros naturales es: " + sumaDeCuadrados);
    }
}
