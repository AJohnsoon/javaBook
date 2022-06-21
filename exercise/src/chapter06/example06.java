package chapter06;

import java.util.Locale;
import java.util.Scanner;

public class example06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a quantidade Numeros: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.printf("Digite a 1ª nota: ");
            double nota1 = sc.nextDouble();
            System.out.printf("Digite a 2ª nota: ");
            double nota2 = sc.nextDouble();
            System.out.printf("Digite a 3ª nota: ");
            double nota3 = sc.nextDouble();
            double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10;
            System.out.printf("Media: %.1f%n", media);
        }
        sc.close();
    }
}
