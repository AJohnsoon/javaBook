package exer2;

import java.util.Scanner;

public class example02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("neutro");
        } else if (number % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        sc.close();

    }
}
