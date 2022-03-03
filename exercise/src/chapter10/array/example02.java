package chapter10.array;

import java.util.Locale;
import java.util.Scanner;

import chapter10.array.entities.Product;

public class example02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number products: ");
        int num = sc.nextInt();
        Product[] vect = new Product[num];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Insert product name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.printf("Insert product price: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);

        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.println("AVERAGE PRICE: " + String.format("%.2f", avg));
        sc.close();
    }
}
