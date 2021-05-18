import java.util.Scanner;

/**
 * lista03Ex07
 */
public class lista03Ex07 {

    public static void main(String[] args) {
        double ang;
        double seno, cosseno, tangente, secante, cossecante, cotangente; 
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        ang = leitor.nextInt();

        seno = Math.sin(ang);
        cosseno = Math.cos(ang);
        tangente = Math.tan(ang);
        secante = 1 / Math.cos(ang);
        cossecante = 1 / Math.sin(ang);
        cotangente = 1 / Math.tan(ang);

        System.out.println("Seno: "+seno);
        System.out.println("Cosseno: "+cosseno);
        System.out.println("Tangente: "+tangente);
        System.out.println("Secante: "+secante);
        System.out.println("Cossecante: "+cossecante);
        System.out.println("Cotangente: "+cotangente);
        
    }
}