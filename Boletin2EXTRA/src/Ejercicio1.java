import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Leer el precio de tarifa
        System.out.print("Introduce el precio de tarifa: ");
        double precioTarifa = sc.nextDouble();

        // Leer el precio pagado
        System.out.print("Introduce el precio pagado: ");
        double precioPagado = sc.nextDouble();

        // Calcular el porcentaje de descuento
        if (precioTarifa > 0) {
            double descuento = ((precioTarifa - precioPagado) / precioTarifa) * 100;

            // Mostrar el porcentaje de descuento
            System.out.printf("El porcentaje de descuento es: %.2f%%", descuento);
        } else {
            System.out.println("El precio de tarifa debe ser mayor que 0.");
        }

        // Cerrar el objeto Scanner
        sc.close();
    }
}
