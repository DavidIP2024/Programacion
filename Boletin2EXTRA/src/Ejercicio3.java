import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Leer la cantidad de billetes de 100€
        System.out.print("Introduce la cantidad de billetes de 100€: ");
        int billetes100 = sc.nextInt();

        // Leer la cantidad de billetes de 20€
        System.out.print("Introduce la cantidad de billetes de 20€: ");
        int billetes20 = sc.nextInt();

        // Leer la cantidad de billetes de 5€
        System.out.print("Introduce la cantidad de billetes de 5€: ");
        int billetes5 = sc.nextInt();

        // Leer la cantidad de monedas de 1€
        System.out.print("Introduce la cantidad de monedas de 1€: ");
        int monedas1 = sc.nextInt();

        // Calcular el valor total
        int totalEuros = (billetes100 * 100) + (billetes20 * 20) + (billetes5 * 5) + monedas1;

        // Mostrar el valor total
        System.out.println("El total en euros es: " + totalEuros + " €");

        // Cerrar el objeto Scanner
        sc.close();
    }
}
