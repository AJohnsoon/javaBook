package chapter05;

import java.util.Locale;
import java.util.Scanner;

public class example06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira um valor: ");
        double value = sc.nextDouble();

        if (value < 0.0 || value > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (value <= 25) {
            System.out.printf("Intervalo [0,25]");
        } else if (value <= 50) {
            System.out.printf("Intervalo [25, 50]");
        } else if (value <= 75) {
            System.out.printf("Intervalo [50, 75]");
        } else {
            System.out.printf("Intervalo [75, 100]");
        }
        sc.close();

    }
}
