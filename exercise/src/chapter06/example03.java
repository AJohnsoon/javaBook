package chapter06;

import java.util.Scanner;

public class example03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione uma opção");
        System.out.println("1 - Alcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("0 - Sair");
        System.out.println("_______________");
        System.out.printf("Insira o codigo do combustivel: ");
        int codigo = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigo != 0) {
            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            } else {
                System.out.println("Opção Invalida");
            }
            System.out.printf("Insira o código do combustivel: ");
            codigo = sc.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();

    }
}
