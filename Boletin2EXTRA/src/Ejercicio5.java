import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os datos ao usuario
        System.out.print("Introduce o soldo fixo: ");
        double soldoFixo = scanner.nextDouble();

        System.out.print("Introduce o importe total de vendas: ");
        double vendasTotais = scanner.nextDouble();

        System.out.print("Introduce a quilometraxe (en km): ");
        double quilometraxe = scanner.nextDouble();

        System.out.print("Introduce o número de días de desprazamento: ");
        int diasDespraza = scanner.nextInt();

        // Calcular comisión, quilometraxe e dietas
        double comision = 0.05 * vendasTotais;
        double totalQuilometraxe = quilometraxe * 2;
        double dietas = diasDespraza * 30;

        // Calcular soldo bruto
        double soldoBruto = soldoFixo + comision + totalQuilometraxe + dietas;

        // Calcular I.R.P.F. e retención a seguridade social
        double irpf = 0.18 * soldoBruto;
        double retencionSeguridadeSocial = 36;

        // Calcular soldo líquido
        double soldoLiquido = soldoBruto - irpf - retencionSeguridadeSocial;

        // Mostrar resultados
        System.out.printf("Soldo Bruto: %.2f €%n", soldoBruto);
        System.out.printf("Soldo Líquido: %.2f €%n", soldoLiquido);

        // Pechar o scanner
        scanner.close();
    }
}
