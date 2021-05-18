import java.util.Scanner;

public class lista01Ex02 {
    public static void main(String[] args) {
        //System.out.println("Hello Word!!!");
        int n1, n2;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        n1 = leitor.nextInt();
        System.out.println("Digite um número:");
        n2 = leitor.nextInt();

        int soma = n1+n2;
        int menos = n1-n2;
        int mult = n1*n2;

        System.out.println(n1 + " + " + n2 + " = " + soma);
        System.out.println(n1 + " - " + n2 + " = " + menos);
        System.out.println(n1 + " * " + n2 + " = " + mult);
        
    }
}
