package oop.chapter9;

import java.util.Locale;
import java.util.Scanner;

import oop.chapter9.entities.ProductOOP;

public class productMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ProductOOP product = new ProductOOP();

        System.out.printf("Product Name: ");
        String addName = sc.nextLine();

        System.out.printf("Product Price: ");
        double addPrice = sc.nextDouble();

        System.out.printf("Adicionar alguma quantidade: ");
        char opcao = sc.next().charAt(0);
        sc.nextLine();

        if (opcao == 'n') {
            product = new ProductOOP(addName, addPrice);
            System.out.println(product);
        } else if (opcao == 's') {
            System.out.printf("Product Quantity: ");
            int addQuantity = sc.nextInt();

            product = new ProductOOP(addName, addPrice, addQuantity);
            System.out.println(product);
        }

        System.out.printf("Add more quantity: ");
        int addNewQuantity = sc.nextInt();
        product.AddProducts(addNewQuantity);
        System.out.println(product);

        System.out.printf("Remove any quantity: ");
        int removeNewQuantity = sc.nextInt();
        while (removeNewQuantity > product.getQuantity()) {
            System.out.println("Unavailable quantity. Quantity available: " + product.getQuantity());
            System.out.printf("Remove any valid quantity: ");
            removeNewQuantity = sc.nextInt();
        }
        product.RemoveProducts(removeNewQuantity);
        System.out.println(product);

        sc.close();

    }
}
