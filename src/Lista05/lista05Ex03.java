package Lista05;

import java.util.Scanner;
//import java.util.Vector;

/**
 * lista04Ex06
 */
public class lista05Ex03 {

    public static void main(String[] args) {
        String[] nomes;
        nomes = new String[5];
        double[] notas = new double[5];
        double soma = 0;
        double media;

        for (int i = 0; i <= 4; i++) {
            System.out.println("Aluno nº: " + (i + 1));
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Nota do aluno nº: " + (i + 1));
            notas[i] = new Scanner(System.in).nextDouble();
            soma += notas[i];
        }
        media = soma / 5;
        System.out.println("A média dos alunos é: " + media);
        System.out.println();
        System.out.println("Lista dos alunos com nota acima da média: ");
        for (int i = 0; i <= 4; i++) {
            if (notas[i] > media) {
                System.out.println(nomes[i]);
            }
        }

    }
}