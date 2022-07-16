package chapter14;

import chapter14.entities.example04.Employee;
import chapter14.entities.example04.OutsourceEmployee;

import java.util.ArrayList;

public class example04 {
    public static void main(String[] args){
        Employee alex = new Employee("Alex",50,20.00);
        Employee bob = new OutsourceEmployee("Bob", 100, 15.00, 200);
        Employee maria = new Employee("Maria",60,20.00);

        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(alex);
        employee.add(bob);
        employee.add(maria);

        for(Employee employer : employee){
            String name = employer.getName();
            Double payment =  employer.Payment();
            System.out.println(name + ": " + payment);
        }
        //System.out.println(employee);
    }
}
