package chapter10.list.entities;

public class Employer {
    private int id;
    private String name;
    private double salary;

    public Employer(){}
    public Employer(String name){
        this.name = name;
    }
    public Employer(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        salary += salary * percent / 100;
    }


    @Override
    public String toString() {
        return " \n{" +"id: " + id + ", name: " + name + ", salary: " + salary + "} \n" ;
    }
}
