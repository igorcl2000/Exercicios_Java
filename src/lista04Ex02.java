import java.util.Scanner;

/**
 * lista04Ex01
 */
public class lista04Ex02 {

    public static void main(String[] args) {
        int vida, atq, def;
        double media;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a vida:");
        vida = leitor.nextInt();
        System.out.println("Digite o ataque:");
        atq = leitor.nextInt();
        System.out.println("Digite a defesa:");
        def = leitor.nextInt();

        media = (vida + atq + def) / 3;

        if (media <25) {
            System.out.println("Ranking: Novato!");
        } if (media > 25 && media <=50) {
            System.out.println("Ranking: Mago!");
        } if (media > 50 && media <=75) {
            System.out.println("Ranking: Mago Supremo!");
        } if (media > 75) {
            System.out.println("Ranking: Lord das Magias");
        }
    }
}