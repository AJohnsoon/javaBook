package chapter08.withOop;

import chapter08.withOop.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class triangleMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.sideA = scanner.nextDouble();
        x.sideB = scanner.nextDouble();
        x.sideC = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.sideA = scanner.nextDouble();
        y.sideB = scanner.nextDouble();
        y.sideC = scanner.nextDouble();

        double areaX = x.Area();
        double areaY = y.Area();

        System.out.printf("Triangle X area: %.4f%n ", areaX);
        System.out.printf("Triangle Y area: %.4f%n ", areaY);

        if (areaX > areaY) {
            System.out.print("Larger area: X");
        } else {
            System.out.print("Larger area: Y");
        }

        scanner.close();
    }
}
