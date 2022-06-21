package chapter05;

import java.util.Scanner;

public class extraOptionalTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insiria um valor válido: ");
        int value = sc.nextInt();
        String permitido = "Você tem permissão";
        String naoPermitido = "Você não tem permissão";
        String valorRetornado = (value <= 18) ? naoPermitido : permitido;
        System.out.printf(valorRetornado);
        sc.close();
    }
}
