package Lista05;

import java.util.Scanner;
//import java.util.Vector;

/**
 * lista04Ex06
 */
public class lista05Ex01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println((i + 1) + " Digite um número:");
            num[i] = leitor.nextInt();
        }
        System.out.println(" ");
        System.out.println("Todos os Numeros: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Todos os Numeros Pares: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Todos os Numeros Impares: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i] + " ");
            }
        }

    }
}