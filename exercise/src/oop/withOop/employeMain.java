package oop.withOop;

import java.util.Locale;
import java.util.Scanner;

import oop.withOop.entities.Employer;

public class employeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Employer employer = new Employer();

        System.out.printf("Enter employer name: ");
        String name = scan.nextLine();
        employer.setName(name);

        System.out.printf("Enter employer salary: ");
        double salary = scan.nextDouble();
        employer.setGrossSalary(salary);

        System.out.println(employer);

        System.out.printf("Witch percentage to increase salary: ");
        double newPercentage = scan.nextDouble();
        employer.increaseSalary(newPercentage);

        System.out.println("Update " + employer);

        scan.close();

    }
}
