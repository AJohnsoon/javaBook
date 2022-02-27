package exer3;

import java.util.Scanner;

public class example05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira a quantidade de vezes: ");
        int numero = sc.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i < numero; i++) {
            System.out.printf("insira o valor para ser computado: ");
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " - In");
        System.out.println(out + "- Out");
        sc.close();

    }
}
