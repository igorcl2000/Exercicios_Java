package Lista04;

import java.util.Scanner;

/**
 * lista04Ex03
 */
public class lista04Ex03 {

    public static void main(String[] args) {
        int vit, der, emp;
        float total, vitP, derP, empP;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de vitorias:");
        vit = leitor.nextInt();
        System.out.println("Digite o número de derrotas:");
        der = leitor.nextInt();
        System.out.println("Digite o número de empates:");
        emp = leitor.nextInt();

        total = vit+der+emp;

        vitP = vit/total *100;
        derP = der/total *100;
        empP = emp/total *100;

        System.out.println("-=- A equipe PaiN -=-");
        System.out.println(vit + " Vitorias - " + vitP + "%");
        System.out.println(der + " Vitorias - " + derP + "%");
        System.out.println(emp + " Vitorias - " + empP + "%");
    }
}