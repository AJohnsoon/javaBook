package chapter05;

import java.util.Locale;
import java.util.Scanner;

public class example05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Insira o código do produto: ");
        int codigo = sc.nextInt();
        System.out.printf("Insira a quantidade: ");
        int quantidade = sc.nextInt();
        double total;
        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
            default:
                total = 0;
        }
        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();

    }
}
