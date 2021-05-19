package Lista01;


import java.util.Scanner;

public class lista01Ex01 {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = leitor.nextInt();
        int dobro, triplo;
        dobro = num * 2;
        triplo = num * 3;
        System.out.println("O número Digitado: " + num);
        System.out.println("O seu dobro: " + dobro);
        System.out.println("O seu triplo: " + triplo);
    }
}
