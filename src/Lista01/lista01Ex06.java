package Lista01;

import java.util.Scanner;

/**
 * lista01Ex05
 */
public class lista01Ex06 {

    public static void main(String[] args) {
        double temp;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        temp = leitor.nextDouble();
        double resp = (5*(temp-32)/9);
        System.out.println(temp + "ºF em Celsius: " + resp + "ºC");
    }
}