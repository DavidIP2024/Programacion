import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Leer la cantidad de dinero en euros
        System.out.print("Introduce una cantidad entera en euros: ");
        int cantidad = sc.nextInt();

        // Inicializar contadores
        int billetes100 = 0, billetes20 = 0, billetes5 = 0, monedas1 = 0;

        // Calcular el desglose
        if (cantidad >= 100) {
            billetes100 = cantidad / 100;
            cantidad = cantidad % 100;
        }
        if (cantidad >= 20) {
            billetes20 = cantidad / 20;
            cantidad = cantidad % 20;
        }
        if (cantidad >= 5) {
            billetes5 = cantidad / 5;
            cantidad = cantidad % 5;
        }
        // Lo que queda es el número de monedas de 1€
        monedas1 = cantidad;

        // Mostrar el desglose
        System.out.println("Desglose:");
        System.out.println("Billetes de 100€: " + billetes100);
        System.out.println("Billetes de 20€: " + billetes20);
        System.out.println("Billetes de 5€: " + billetes5);
        System.out.println("Monedas de 1€: " + monedas1);

        // Cerrar el objeto Scanner
        sc.close();
    }
}
