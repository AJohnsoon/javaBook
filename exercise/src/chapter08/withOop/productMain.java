package chapter08.withOop;

import chapter08.withOop.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class productMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.printf("Product Name: ");
        product.name = sc.nextLine();
        System.out.printf("Product Price: ");
        product.price = sc.nextDouble();
        System.out.printf("Product Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(product);

        System.out.printf("Add more quantity: ");
        int addNewQuantity = sc.nextInt();
        product.AddProducts(addNewQuantity);
        System.out.println(product);

        System.out.printf("Remove any quantity: ");
        int removeNewQuantity = sc.nextInt();
        product.RemoveProducts(removeNewQuantity);
        System.out.println(product);

        sc.close();

    }
}
