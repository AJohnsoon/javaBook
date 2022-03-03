package chapter10.array;

import java.util.Scanner;

import chapter10.array.entities.Student;

public class example03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roomQuantity;
        Student[] vect = new Student[10];
        boolean flag;

        System.out.printf("How many rooms will be rented ? ");

        do {
            roomQuantity = sc.nextInt();
            if (roomQuantity >= 1 && roomQuantity <= 10) {
                flag = true;
            } else {
                System.out.println("\nOnly allowed range 1-10 to set quantity of rooms");
                System.out.print("Please, pay attention! Enter valid value: ");
                flag = false;
            }
        } while (flag == false);

        for (int i = 0; i < roomQuantity; i++) {
            System.out.printf("%nRent #%d:%n", i);
            System.out.printf("Name: ");
            String studantName = sc.next();
            sc.nextLine();
            System.out.printf("E-mail: ");
            String studantEmail = sc.next();
            sc.nextLine();
            System.out.printf("Room: ");
            int studentRoom = sc.nextInt();
            sc.nextLine();
            System.out.println();

            vect[studentRoom] = new Student(studantName, studantEmail, studentRoom);

        }

        for (Student student : vect) {
            if (student != null) {
                System.out.println(student);
            }
        }

        sc.close();
    }
}
