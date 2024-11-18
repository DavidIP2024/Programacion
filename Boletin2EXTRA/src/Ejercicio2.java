import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Leer el valor de la temperatura en grados Celsius
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double gradosCelsius = sc.nextDouble();

        // Calcular la temperatura en grados Fahrenheit
        double gradosFahrenheit = (gradosCelsius * 9 / 5) + 32;

        // Calcular la temperatura en grados Kelvin
        double gradosKelvin = gradosCelsius + 273.15;

        // Mostrar los resultados
        System.out.printf("La temperatura en grados Fahrenheit es: %.2f°F", gradosFahrenheit);
        System.out.printf("La temperatura en grados Kelvin es: %.2fK", gradosKelvin);

        // Cerrar el objeto Scanner
        sc.close();
    }
}
