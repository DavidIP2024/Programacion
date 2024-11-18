public class Ejercicio3 {
    public static void main(String[] args) {
        int m,n,p,q,r;
        int i;
        m = 10;
        n = 2;
        // Primera operacion
        int resultado1 = (m + n) / n;
        System.out.println(resultado1);
        // Segunda operacion
        p = 4;
        r = 1;
        int s = 1;
        int resultado2= (((m + n) / p) / (p - r) / s);
        System.out.println(resultado2);
        // Tercera operacion
        q = 2;
        int resultado3= (m + 4)/(p-q);
        System.out.println(resultado3);
        // Cuarta operacion
        int c = 200;
        int t = 400;
        int resultado4= (c * r * t)/100;
        System.out.println(resultado4);
        // Quinta operacion
        int resultado5 = (m+n) / (p + (q/r));
        System.out.println(resultado5);
        // Sexta operacion
        int resultado6= (m / n) * (p+q);
        System.out.println(resultado6);
        // Septima operacion
        i = 2;
    }

}