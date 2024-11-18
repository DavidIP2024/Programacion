import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        // Bucle para leer hasta 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            // Comprobar si el número es 999
            if (numero == 999) {
                System.out.println("Número 999 detectado, terminando el bucle.");
                break; // Termina el bucle sin agregar 999 a la suma
            }

            // Agregar el número a la suma
            suma += numero;
        }

        // Mostrar el resultado de la suma
        System.out.println("La suma de los números ingresados es: " + suma);

        scanner.close();
    }
}