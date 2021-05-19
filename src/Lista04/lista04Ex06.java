package Lista04;

import java.util.Scanner;

/**
 * lista04Ex06
 */
public class lista04Ex06 {

    public static void main(String[] args) {
        int num, i;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = leitor.nextInt();

        i = num * 20 * ( 20 + 1 ) / 2;

        System.out.print(i);
    }
}