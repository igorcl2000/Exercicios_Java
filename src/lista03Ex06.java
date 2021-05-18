import java.util.Scanner;

/**
 * lista03Ex06
 */
public class lista03Ex06 {

    public static void main(String[] args) {
        int n1,n2,n3,n4;
        double media;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        n1 = leitor.nextInt();
        System.out.println("Digite a nota 2: ");
        n2 = leitor.nextInt();
        System.out.println("Digite a nota 3: ");
        n3 = leitor.nextInt();
        System.out.println("Digite a nota 4: ");
        n4 = leitor.nextInt();

        media = ((n1*1) + (n2*2) + (n3*3) + (n4*4))/10;

        System.out.println("A média ponderada do aluno é: " + media);

        
    }
}