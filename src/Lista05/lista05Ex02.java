package Lista05;

import java.util.Scanner;
//import java.util.Vector;

/**
 * lista04Ex06
 */
public class lista05Ex02 {

    public static void main(String[] args) {
        int quantidade;
        double media = 0;
        System.out.println("Informe a quantidade de notas:");
        quantidade = new Scanner(System.in).nextInt();
        double vetor[];
        vetor = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota.");
            vetor[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < quantidade; i++) {
            media += vetor[i];
        }
        media /= quantidade;
        System.out.println("A média é:  " + media);
        for (int i = 0; i < quantidade; i++) {
            if (vetor[i] > media) {
                System.out.println("Acima da média: " + vetor[i]);
            } else {
                System.out.println("Abaixo da média: " + vetor[i]);
            }
        }

    }
}