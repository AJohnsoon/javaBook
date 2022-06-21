package chapter05;

import java.util.Scanner;

public class example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero (Positivo ou Negativo)");
        int numero = sc.nextInt();
        if (numero >= 0) {
            System.out.println("Não Negativo");
        } else {
            System.out.println("Negativo");
        }
        sc.close();

    }
}
