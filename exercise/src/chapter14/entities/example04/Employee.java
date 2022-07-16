package chapter14.entities.example04;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Employee {
    private String name;
    private int hours;
    private Double valuePerHour;

    public Employee(){}

    public Employee(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public double Payment(){
        return  valuePerHour *= hours ;
    }

    @Override
    public String toString() {
        NumberFormat formatter = new DecimalFormat("0.00");
        return "\nEmployee { " +
                "\n name: " + name +
                "\n hours: " + hours +
                "\n valuePerHour: " + valuePerHour +
                "\n Payment: $"+ Payment()+
                "\n }";
    }
}
