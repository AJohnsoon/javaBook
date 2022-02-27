package exer3;

import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Entrada : ");
        int entrada = sc.nextInt();

        for (int i = 1; i <= entrada; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }
        sc.close();

    }
}
