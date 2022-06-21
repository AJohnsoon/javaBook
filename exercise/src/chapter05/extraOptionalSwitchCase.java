package chapter05;

import java.util.Scanner;

public class extraOptionalSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira o dia que deseja: ");
        int dia = sc.nextInt();
        String nomeDoDia;
        switch (dia) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda";
                break;
            case 3:
                nomeDoDia = "Terça";
                break;
            case 4:
                nomeDoDia = "Quarta";
                break;
            case 5:
                nomeDoDia = "Quinta";
                break;
            case 6:
                nomeDoDia = "Sexta";
                break;
            case 7:
                nomeDoDia = "Sabado";
                break;
            default:
                nomeDoDia = "Inválido";
        }
        System.out.printf("Dia da semana: " + nomeDoDia);
        sc.close();

    }
}
