import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;
        int conteoEntre1000y1750 = 0;
        int conteoMenosDe1000 = 0;
        int totalTrabajadores = 0;

        // Leer los salarios hasta que se ingrese 0
        while (true) {
            System.out.print("Introduce o soldo do traballador (0 para finalizar): ");
            salario = scanner.nextDouble();

            // Salir si el salario es 0
            if (salario == 0) {
                break;
            }

            // Validar que el salario no sea negativo
            if (salario < 0) {
                System.out.println("Non se admiten soldos negativos. Inténtao de novo.");
                continue; // Volver a pedir el salario
            }

            // Contar salarios
            totalTrabajadores++;

            if (salario >= 1000 && salario <= 1750) {
                conteoEntre1000y1750++;
            } else if (salario < 1000) {
                conteoMenosDe1000++;
            }
        }

        // Calcular el porcentaje de trabajadores que ganan menos de 1000 €
        double porcentajeMenosDe1000 = (totalTrabajadores > 0) ?
                ((double) conteoMenosDe1000 / totalTrabajadores) * 100 : 0;

        // Mostrar los resultados
        System.out.println("Número de traballadores que ganan entre 1000 e 1750 €: " + conteoEntre1000y1750);
        System.out.printf("Porcentaxe de traballadores que ganan menos de 1000 €: %.2f%%\n", porcentajeMenosDe1000);
    }
}
