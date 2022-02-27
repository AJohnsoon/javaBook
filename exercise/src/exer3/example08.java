package exer3;

import java.util.Scanner;

public class example08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a entrada: ");
        int entrada = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= entrada; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial: " + fatorial);
        sc.close();

    }
}
