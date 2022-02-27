package exer2;

import java.util.Scanner;

public class example04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a hora incial: ");
        int horaInicial = sc.nextInt();
        System.out.print("Informe a hora final: ");
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;

        }
        System.out.println("O jogo durou " + duracao + " horas");
        sc.close();
    }
}
