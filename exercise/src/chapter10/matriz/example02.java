package chapter10.matriz;

import java.util.Scanner;

public class example02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number of Line: ");
        int n  = input.nextInt();
        System.out.println("Enter a number of Column: ");
        int m = input.nextInt();


        int[][] arr = new int[n][m];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Insert the value: ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Insert the 'X' value: ");
        int x = input.nextInt();

        for (int k = 0; k < arr.length; k++){
            for(int l = 0; l < arr[k].length; l++){
                if(arr[k][l] == x){
                    System.out.println("Position " + k + "," + l + ":");
                    if(l > 0 ){
                        System.out.println("Left: " + arr[k][l-1]);
                    }
                    if(k > 0){
                        System.out.println("Up: " + arr[k-1][l]);
                    }
                    if(l < arr[k].length -1){
                        System.out.println("Right: " + arr[k][l+1]);
                    }
                    if(k < arr.length-1){
                        System.out.println("Down: " + arr[k+1][l]);
                    }

                }
            }
        }
        input.close();
    }
}
