package chapter13.entities;

import chapter13.entities.enums.WorkerLevel;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private Department department;

    private ArrayList<Contract> contract = new ArrayList<>();

    public Worker(){}

    public Worker(String name, WorkerLevel level, double baseSalary, Department department){
        this.name = name;
        this.level = level;
        if(level.equals(WorkerLevel.JUNIOR) || level.equals(WorkerLevel.MID_LEVEL) || level.equals(WorkerLevel.SENIOR)){
            this.level = level;
        }
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<Contract> getContract() {
        return contract;
    }

    public void addNewContract(Contract contracts) {
       contract.add(contracts);
    }

    public void removeContract(Contract contracts){
        contract.remove(contracts);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(Contract con : contract){
            cal.setTime(con.getDate());
            int con_year = cal.get(Calendar.YEAR);
            int con_month = 1 + cal.get(Calendar.MONTH);

            if(year == con_year && month == con_month){
                sum += con.totalValue();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "\nWorker {" +
                "\n name: '" + name + '\'' +
                "\n level: " + level +
                "\n Department: " + getDepartment() +
                "\n baseSalary: R$" + new DecimalFormat("0.00").format(baseSalary) +
                "\n Contracts: "+ getContract() +
                "\n}";
    }
}
