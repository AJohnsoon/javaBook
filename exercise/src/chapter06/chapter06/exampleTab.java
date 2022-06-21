package chapter06.chapter06;

import java.util.Scanner;

public class exampleTab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira o valor: ");
        int valor = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mult = valor * i;
            System.out.println(valor + "x" + i + "=" + mult);
        }
        sc.close();
    }
}
