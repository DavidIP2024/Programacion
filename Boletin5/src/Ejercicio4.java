import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Introduce un número para ver su tabla de multiplicar (0 para salir): ");
            numero = scanner.nextInt();

            // Salir del programa si el número es 0
            if (numero == 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            // Mostrar la tabla de multiplicar
            System.out.println("Tabla de multiplicar de " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.println(); // Línea en blanco para separar las tablas
        }
    }
}