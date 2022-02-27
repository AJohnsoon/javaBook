package oop.withOop;

import java.util.Locale;
import java.util.Scanner;

import oop.withOop.utils.CurrencyConverter;

public class converterMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.printf("How many dollars will be bought? ");
        double bought = sc.nextDouble();

        double amount = CurrencyConverter.ConvertAmountToReal(dollarPrice, bought);

        System.out.printf("Amount to be paid in reais: $%.2f", amount);

        sc.close();
    }
}
