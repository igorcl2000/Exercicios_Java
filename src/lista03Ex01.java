import java.util.Scanner;

/**
 * lista03Ex01
 */
public class lista03Ex01 {

    public static void main(String[] args) {
        int num;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = leitor.nextInt();

        int ant = num - 1;
        int suc = num + 1;

        System.out.format("\nO antecessor de %d é %d.", num, ant);
        System.out.format("\nO sucessor de %d é %d.", num, suc);
    }
}