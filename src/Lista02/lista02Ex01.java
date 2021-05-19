package Lista02;

import javax.swing.JOptionPane;

/**
 * lista02Ex01
 */
public class lista02Ex01 {

    private static String showInputDialog;

    public static void main(String[] args) {
        String clas, classe1 = " ";
        String regiao, regiao1 = " ";
        String arma, arma1 = " ";
        String defal = " ";

        clas = JOptionPane.showInputDialog(null, "Digite a classe do seu personagem: \n  Guerreiro\n  Mago\n  Druida\n  Sacerdote");

        switch (clas) {
            case "Guerreiro":
                classe1 = "Guerreiro";
                break;
            case "Mago":
                classe1 = "Mago";
                break;
            case "Druida":
                classe1 = "Druida";
                break;
            case "Sacerdote":
                classe1 = "Sacerdote";
                break;
            default:
                defal = "Não encontrado";
                break;
        }

        regiao = JOptionPane.showInputDialog(null, "Digite a região do seu personagem: \n  Azeroth\n  Azkaban \n  Aurora \n  Brightwood");

        switch (regiao) {
            case "Azeroth":
                regiao1 = "Azeroth";
                break;
            case "Azkaban":
                regiao1 = "Azkaban";
                break;
            case "Aurora":
                regiao1 = "Aurora";
                break;
            case "Brightwood":
                regiao1 = "Brightwood";
                break;
            default:
                defal = "Não encontrado";
                break;
        }

        arma = JOptionPane.showInputDialog(null, "Digite a arma do seu personagem: \n  Machado cego\n  Picareta invertida\n  Adaga sem ponta\n  Corrente sem elo");

        switch (arma) {
            case "Machado cego":
                arma1 = "Machado cego.";
                break;
            case "Picareta invertida":
                arma1 = "Picareta invertida.";
                break;
            case "Adaga sem ponta":
                arma1 = "Adaga sem ponta.";
                break;
            case "Corrente sem elo":
                arma1 = "Corrente sem elo.";
                break;
            default:
                defal = "Não encontrado.";
                break;
        }

        String mensagem = String.format("Você agora e um %s da região %s armado com um %s", classe1, regiao1, arma1);

        JOptionPane.showMessageDialog(null, mensagem, "Informações", JOptionPane.INFORMATION_MESSAGE);

    }
}