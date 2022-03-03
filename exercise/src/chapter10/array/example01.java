package chapter10.array;

import java.util.Locale;
import java.util.Scanner;

public class example01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Value N(x): ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Height: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.println("AVERAGE HEIGHT: " + String.format("%.2f", avg));

        sc.close();

    }
}
