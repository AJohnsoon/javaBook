package chapter10.list;

import chapter10.list.entities.Employer;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mainEmployer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Employer> list = new ArrayList<>();

        System.out.println("How many employees will be registered??");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employer ID: ");
            Integer inputId = input.nextInt();
            while (hasId(list, inputId)){
                System.out.println("ID already taken! Please try again: ");
                inputId = input.nextInt();
            }
            System.out.println("Enter employer name: ");
            String inputName = input.next();
            input.nextLine();
            System.out.println("Enter salary: ");
            double inputSalary = input.nextDouble();

            Employer employer = new Employer(inputId, inputName, inputSalary);
            list.add(employer);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idSalary = input.nextInt();

//        Integer position = positionId(list, idsalary);
        Employer employer = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

//        if(position == null)
        if(employer == null){
            System.out.println("This ID does not exist!");
        }
        else{
            System.out.println("Enter the percentage: ");
            double percent = input.nextDouble();
//            list.get(position).increaseSalary(percent);
            employer.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employer e: list) {
            System.out.println(e);
        }
        input.close();
    }

//    public static Integer positionId(List<Employer> list, int id){
//        for(int i=0; i<list.size(); i++){
//            if(list.get(i).getId() == id){
//                return i;
//            }
//        }
//        return null;
//    }

    public static boolean hasId(List<Employer> list, int id){
        Employer emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
