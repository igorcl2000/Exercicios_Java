import java.util.Scanner;

/**
 * lista04Ex05
 */
public class lista04Ex05 {

    public static void main(String[] args) {
        int num, i;
        int fact = 1;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = leitor.nextInt();

        for(i=1;i<=num;i++){
            fact *=i;
        }

        System.out.println("O fatorial de "+ num + " é: " + fact);
    }
}