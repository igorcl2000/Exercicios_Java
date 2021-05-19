package Lista03;

import java.util.Scanner;

/**
 * Innerlista03Ex02
 */
public class lista03Ex02 {

    public static void main(String[] args) {
        int n1, n2;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        n1 = leitor.nextInt();
        System.out.println("Digite um número:");
        n2 = leitor.nextInt();

        int soma = n1+n2;

        System.out.println(n1 + " + " + n2 + " = " + soma);
    }
}