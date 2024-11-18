public class Ejercicio2 {
    public static void main(String[] args) {
        int suma = 0;
        long producto = 1;

        // Calcular la suma y el producto de los números entre 10 y 90
        for (int i = 10; i <= 90; i++) {
            suma += i;
            producto *= i;
        }

        // Mostrar los resultados
        System.out.println("La suma de los números comprendidos entre 10 y 90 es: " + suma);
        System.out.println("El producto de los números comprendidos entre 10 y 90 es: " + producto);
    }
}
