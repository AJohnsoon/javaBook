package chapter10.matriz;

import java.util.Locale;
import java.util.Scanner;

public class example01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int count = 0;

        System.out.print("Matriz input: ");
        int nPosition = input.nextInt();

        int[][] mat = new int[nPosition][nPosition];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Enter the value of line [" + i + "] of column [" + j + "] ");
                mat[i][j] = input.nextInt();
            }
        }
        System.out.println(showMatriz(mat));

        System.out.println("Main Diagonal");
        for(int k=0; k<mat.length; k++){
            System.out.print(mat[k][k] + " ");
        }
        System.out.println();
        System.out.println();

        for(int y=0; y<mat.length; y++){
           for(int z=0; z<mat[y].length; z++){
               if(mat[y][z] < 0 ){
                   count ++ ;
               }
           }
        }
        System.out.println("Negative numbers: "+ count);
        input.close();
    }

    public static String showMatriz(int[][] matriz) {
        StringBuilder output = new StringBuilder();

        for (int[] value : matriz) {
            for (int position = 0; position < matriz.length; position++) {
                output.append(value[position]).append(" | ");
            }
            output.append("\n");
        }

        return output.toString();


    }
}
