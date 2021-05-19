package Lista01;

import java.util.Scanner;

/**
 * lista01Ex04
 */
public class lista01Ex04 {

    public static void main(String[] args) {
        int r;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o raio de um círculo:");
        r = leitor.nextInt();
        double area = 3.14 * Math.pow(r, 2);
        double peri = 2 * 3.14 * r;
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + peri);
    }
}