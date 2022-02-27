package functions;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = personalMaxFunction(a, b, c);
        personalShowResult(result);

        sc.close();

    }

    public static int personalMaxFunction(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static void personalShowResult(int value) {
        System.out.println("Higher: " + value);
    }
}
