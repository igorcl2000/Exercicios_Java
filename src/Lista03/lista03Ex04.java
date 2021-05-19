package Lista03;

import java.util.Scanner;

/**
 * lista03Ex04
 */
public class lista03Ex04 {

    public static void main(String[] args) {
        int num, b;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = leitor.nextInt();

        while(num>0){
            num = num/2;
            System.out.println(num%2);
        }
    }
}