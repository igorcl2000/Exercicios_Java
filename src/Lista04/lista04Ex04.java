package Lista04;

import java.util.Scanner;

/**
 * lista04Ex04
 */
public class lista04Ex04 {

    public static void main(String[] args) {
        int num, i;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = leitor.nextInt();

        i = num % 2;
        //System.out.println(i);
        if (i == 0) {
            System.out.println("Número par.");
        }if (i == 1){
            System.out.println("Número ímpar.");
        }
    }
}