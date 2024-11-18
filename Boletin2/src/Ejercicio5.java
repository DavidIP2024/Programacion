import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario la distancia en millas náuticas
        System.out.print("Introduce la distancia en millas náuticas: ");
        double millasNauticas = sc.nextDouble();

        // Definir la constante de conversión (1 milla náutica = 1852 metros)
        final double METROS_POR_MILLA_NAUTICA = 1852;

        // Calcular la distancia en metros
        double metros = millasNauticas * METROS_POR_MILLA_NAUTICA;

        // Mostrar el resultado
        System.out.println(millasNauticas + " millas náuticas equivalen a " + metros + " metros.");

        // Cerrar el objeto Scanner
        sc.close();
    }
}