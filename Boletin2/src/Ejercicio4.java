import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Leer el primer número
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        // Leer el segundo número
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        // Calcular y mostrar la suma
        double suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);

        // Calcular y mostrar la resta
        double resta = num1 - num2;
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);

        // Calcular y mostrar el producto
        double producto = num1 * num2;
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);

        // Calcular y mostrar el cociente (comprobar si num2 no es cero)
        if (num2 != 0) {
            double cociente = num1 / num2;
            System.out.println("El cociente de " + num1 + " entre " + num2 + " es: " + cociente);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        // Cerrar el objeto Scanner
        sc.close();
    }
}
