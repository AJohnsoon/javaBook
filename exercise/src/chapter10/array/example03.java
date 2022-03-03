package chapter10.array;

import java.util.Locale;
import java.util.Scanner;

import chapter10.array.entities.Student;

public class example03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many rooms will be rented ? ");
        int roomRented = sc.nextInt();
        Student[] vect = new Student[roomRented];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.printf("E-mail: ");
            String email = sc.next();
            sc.nextLine();
            System.out.printf("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            System.out.println();
            vect[i] = new Student(name, email, room);
        }

        for (Student student : vect) {
            student.getName();
            student.getEmail();
            student.getRoom();
            System.out.println(student);
        }

        sc.close();
    }
}
