package chapter05;

import java.util.Scanner;

public class extraOptionalSintax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite minutos falados: ");
        int minutes = sc.nextInt();
        double total = 50.00;
        if (minutes > 100) {
            total += (minutes - 100) * 2.0;
        }
        System.out.printf("Valor a pagar: R$ %.2f%n", total);
        sc.close();

    }
}
