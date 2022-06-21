package chapter06;

import java.util.Scanner;

public class example02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira coordenada de X: ");
        int x = sc.nextInt();
        System.out.printf("Insira coordenada de Y: ");
        int y = sc.nextInt();

        while (x != 0 && y !=0) {
            if(x>0 && y>0) {
                System.out.println("Primeiro");
            }
            else if(x>0 && y<0 ) {
                System.out.println("Quarto");
            }
            else if(x<0 && y<0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("Segundo");
            }
            System.out.printf("Insira coordenada de X: ");
            x = sc.nextInt();
            System.out.printf("Insira a coordenada de Y: ");
            y = sc.nextInt();
        }
        System.out.println("FIM");
        sc.close();
    }
}
