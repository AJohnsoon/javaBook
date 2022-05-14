package chapter10.matriz;

import java.util.Locale;
import java.util.Scanner;

public class example01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Matriz input: ");
        int nPosition = input.nextInt();

        int[][] mat = new int[nPosition][nPosition];

        for (int i = 0; i < nPosition; i++) {
            for (int j = 0; j < nPosition; j++) {
                System.out.println("Enter the value of line [" + i + "] of column [" + j + "] ");
                mat[i][j] = input.nextInt();
            }
        }
        System.out.println(showMatriz(mat));
        input.close();
    }

    public static String showMatriz(int[][] matriz) {
        StringBuilder output = new StringBuilder();
        for (int[] value : matriz) {
            for (int position = 0; position < matriz[0].length; position++) {
                output.append(value[position]).append(" - ");
            }
            output.append("\n");
        }

        return output.toString();


    }
}
