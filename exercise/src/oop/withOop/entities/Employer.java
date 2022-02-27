package oop.withOop.entities;

public class Employer {
    private String name;
    private double GrossSalary;
    private double taxa = 1000;

    public Employer() {
    }

    public Employer(String name, double grossSalary) {
        this.name = name;
        this.GrossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return GrossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        GrossSalary = grossSalary;
    }

    public double NetSalary() {
        return this.GrossSalary - taxa;
    }

    public void increaseSalary(double percent) {
        double plus = GrossSalary * percent / 100.0;
        this.GrossSalary += plus;
    }

    @Override
    public String toString() {
        return "data: {" +
                "Emplyee Name: " + this.getName() +
                ", Salary: $" + String.format("%.2f", this.NetSalary()) +
                "}";
    }

}
