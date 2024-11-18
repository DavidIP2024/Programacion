public class Ejercicio5 {
    public static void main(String[] args) {
        int i,j,k;
        double rede;
        double tipo;
        int ano;
        int a,b,c,d;
        // Primera operación
        i = 1;
        j = 0;
        k = 1;
        boolean resultado1 = i + k <= j -k * 3 && k >= 2;
        System.out.println(resultado1);
        // Segunda operacion
        i = 3;
        j = 2;
        k = -1;
        boolean resultado2 = i == 3 || j <= 2 && k > 0;
        System.out.println(resultado2);
        // Tercera operacion
        rede = 7.5;
        tipo = 10.00;
        boolean resultado3 = tipo < rede + 1.5;
        System.out.println(resultado3);
        //Cuarta operacion
        ano = 1993;
        boolean resultado4 = ano % 400 == 0;
        System.out.println(resultado4);
        // Quinta operacion
        boolean resultado5 = 3 == 2 || 5 > 1 + 1;
        System.out.println(resultado5);
        //Sexta operacion
        boolean resultado6 = 5 - 2 > 4 && !(0.5 == 1/5);
        System.out.println(resultado6);
        //Septima operacion
        a = 2;
        b = 5;
        c = 6;
        d = 10;
        boolean resultado7 = a >= b || a >= c && a <d;
        System.out.println(resultado7);
        // Octava operacion
        a = 2;
        b = 5;
        c = 6;
        d = 10;
        boolean resultado8 = a + b < c && a + c < d || 2 * a < a + b;
        System.out.println(resultado8);
        //Novena operacion
        a = 2;
        b = 5;
        c = 6;
        d = 10;
        boolean resultado9 = !(a * b < d) && !(a * b < c) || b + c <= d;
        System.out.println(resultado9);
    }
}