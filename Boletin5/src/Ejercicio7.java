import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicitar al usuario un número n
        System.out.print("Introduce un número para a altura e base do triángulo: ");
        n = scanner.nextInt();

        // Dibujar el triángulo
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
