import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura;

        // Pedir la base y asegurarse de que sea positiva
        do {
            System.out.print("Introduce la base del rectángulo (valor positivo): ");
            base = scanner.nextDouble();
            if (base <= 0) {
                System.out.println("La base debe ser un número positivo. Inténtalo de nuevo.");
            }
        } while (base <= 0);

        // Pedir la altura y asegurarse de que sea positiva
        do {
            System.out.print("Introduce la altura del rectángulo (valor positivo): ");
            altura = scanner.nextDouble();
            if (altura <= 0) {
                System.out.println("La altura debe ser un número positivo. Inténtalo de nuevo.");
            }
        } while (altura <= 0);

        // Calcular el área
        double area = base * altura;

        // Mostrar el resultado
        System.out.println("El área del rectángulo es: " + area);
    }
}