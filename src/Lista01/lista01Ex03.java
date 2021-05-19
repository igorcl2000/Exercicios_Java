package Lista01;

import java.util.Scanner;

/**
 * lista01Ex03
 */
public class lista01Ex03 {

    public static void main(String[] args) {
        int num;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma medida em Metros:");
        num = leitor.nextInt();
        int cen = num*100;
        System.out.println(num + "m em centimetros: " + cen + "cm.");

    }
}