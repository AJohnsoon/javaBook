package chapter06.chapter06;

import java.util.Scanner;

public class exampleDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;
        do {
            System.out.print("Digite a temperatura em ºC: ");
            double celcius = sc.nextDouble();
            double fahrenheit = 9.0 * celcius / 5.0 + 32.0;
            System.out.printf("Valor em Fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Para continuar digite 's': ");
            opcao = sc.next().charAt(0);
        } while (opcao == 's');
        System.out.println("FIM !");
        sc.close();
    }
}
