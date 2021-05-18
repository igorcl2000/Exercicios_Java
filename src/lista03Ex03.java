import java.util.Scanner;

/**
 * lista03Ex03
 */
public class lista03Ex03 {

    public static void main(String[] args) {
        int n1, n2;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        n1 = leitor.nextInt();
        System.out.println("Digite um número:");
        n2 = leitor.nextInt();

        int mult = n1*n2;

        System.out.println(n1 + " * " + n2 + " = " + mult); 
    }
}