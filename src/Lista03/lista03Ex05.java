package Lista03;

import java.util.Scanner;

/**
 * lista03Ex05
 */
public class lista03Ex05 {

    public static void main(String[] args) {
        int num;
        double raiz;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = leitor.nextInt();
        raiz = Math.sqrt(num);
        System.out.format("A raiz de %d é: %f",num ,raiz);
    }
}