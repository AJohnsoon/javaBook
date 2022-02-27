package oop.withOutOop;

import java.util.Locale;
import java.util.Scanner;

public class exampleTriangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the measures of triangle X: ");
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        double sideD = scanner.nextDouble();
        double sideE = scanner.nextDouble();
        double sideF = scanner.nextDouble();

        double perimeter = (sideA + sideB + sideC) / 2;
        double areaX = Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));

        perimeter = (sideD + sideE + sideF) / 2;
        double areaY = Math.sqrt(perimeter * (perimeter - sideD) * (perimeter - sideE) * (perimeter - sideF));

        System.out.printf("Triangle X area: %.2f%n ", areaX);
        System.out.printf("Triangle Y area: %.2f%n ", areaY);

        if (areaX > areaY) {
            System.out.print("Larger area: X");
        } else {
            System.out.print("Larger area: Y");
        }

        scanner.close();
    }
}
