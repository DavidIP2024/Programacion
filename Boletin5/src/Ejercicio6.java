import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        long factorial = 1; // Se usa long para manejar números grandes

        // Pedir un número al usuario
        System.out.print("Introduce un número non negativo para calcular o seu factorial: ");
        numero = scanner.nextInt();

        // Validar que el número sea no negativo
        if (numero < 0) {
            System.out.println("O factorial non está definido para números negativos.");
        } else {
            // Calcular el factorial
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            // Mostrar el resultado
            System.out.println("O factorial de " + numero + " é: " + factorial);
        }
    }
}