package chapter06;

import java.util.Scanner;

public class example07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantidade de Repetições: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.printf("Numero 1: ");
            int numero1 = sc.nextInt();
            System.out.printf("Numero 2: ");
            int numero2 = sc.nextInt();

            if (numero2 == 0) {
                System.out.println("Divisão impossivel");
            } else {
                double div = (double) numero1 / numero2;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();

    }
}
