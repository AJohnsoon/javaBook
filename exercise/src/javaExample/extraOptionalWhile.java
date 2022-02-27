package javaExample;

import java.util.Scanner;

public class extraOptionalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira um valor: ");
        int valor = sc.nextInt();
        int soma = 0;
        while (valor != 0) {
            System.out.printf("[dentro do while]Insira um valor: ");
            soma += valor;
            valor = sc.nextInt();
        }
        System.out.printf("Soma dos valores: " + soma);

        sc.close();
    }
}
