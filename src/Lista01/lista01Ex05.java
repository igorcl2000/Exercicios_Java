package Lista01;

import java.util.Scanner;

/**
 * lista01Ex06
 */
public class lista01Ex05 {

    public static void main(String[] args) {
        double temp;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        temp = leitor.nextDouble();
        double resp = (temp * 9/5) + 32;
        System.out.println(temp + "ºC em Fahrenheit: " + resp + "ºF");
    }
}