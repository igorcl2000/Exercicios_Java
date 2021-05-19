package Lista04;

import java.util.Scanner;

/**
 * lista04Ex01
 */
public class lista04Ex01 {

    public static void main(String[] args) {
        int num;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = leitor.nextInt();

        if (num > 100 && num < 200) {
            System.out.println("Você digitou um número entre 100 e 200");
        } else {
            System.out.println("Você digitou um número fora da faixa");
        }
    }
}