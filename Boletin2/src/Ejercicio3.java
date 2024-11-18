import java.util.Scanner;

public class Ejercicio3 {

    // Función para convertir euros a dólares
    public static double convertirEurosADolares(double euros, double tipoCambio) {
        return euros * tipoCambio;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar la cantidad en euros
        System.out.print("Introduce la cantidad en euros: ");
        double euros = sc.nextDouble();

        // Solicitar el tipo de cambio actual (por ejemplo, 1 euro = 1.10 dólares)
        System.out.print("Introduce el tipo de cambio actual (euros a dólares): ");
        double tipoCambio = sc.nextDouble();

        // Realizar la conversión
        double dolares = convertirEurosADolares(euros, tipoCambio);

        // Mostrar el resultado
        System.out.printf("%.2f euros equivalen a %.2f dólares.", euros, dolares);

        // Cerrar el objeto Scanner
        sc.close();
    }
}
