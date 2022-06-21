package chapter06;

import java.util.Scanner;

public class example04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira um valor inteiro: ");
        int valor = sc.nextInt();
        for (int i = 0; i <= valor; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
