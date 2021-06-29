package Lista05;

import java.util.Scanner;
//import java.util.Vector;

/**
 * lista04Ex06
 */
public class lista05Ex04 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int a[][];
        a = new int[2][2];
        int b[][];
        b = new int[2][2];
        int c[][];
        c = new int[2][2];

        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite o elemento " + i + " " + j + " da matriz a: ");
                a[i][j] = t.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite o elemnto " + i + " " + j + " da matriz b: ");
                b[i][j] = t.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < b.length; j++) {
                for (int x = 0; x < a[i][j]; x++) {
                    c[i][j] = a[i][x] * b[x][j];
                    System.out.print(c[i][j]);
                    System.out.print(" ");
                }

            }
        }

    }
}