package exer2;

import java.util.Scanner;

public class example03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value A:");
        int valueA = sc.nextInt();
        System.out.print("Enter a value B:");
        int valueB = sc.nextInt();

        if (valueA % valueB == 0 || valueB % valueA == 0) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não são Multiplos");
        }
        sc.close();
    }
}
