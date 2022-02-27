package exer3;

import java.util.Scanner;

public class example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira sua senha: ");
        int pwd = sc.nextInt();

        while (pwd != 2022) {
            System.out.println("senha invalida !");
            System.out.printf("Insira sua senha: ");
            pwd = sc.nextInt();
        }
        System.out.print("Acesso Permitido!");
        sc.close();
    }
}
