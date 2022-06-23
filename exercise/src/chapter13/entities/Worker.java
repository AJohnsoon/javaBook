package chapter13.entities;

import chapter13.entities.enums.WorkerLevel;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private ArrayList<Contract> contract = new ArrayList<>();

    public Worker(){}

    public Worker(String name, WorkerLevel level, double baseSalary){
        this.name = name;
        this.level = level;
        if(level.equals(WorkerLevel.JUNIOR) || level.equals(WorkerLevel.MID_LEVEL) || level.equals(WorkerLevel.SENIOR)){
            this.level = level;
        }
        this.baseSalary = baseSalary;
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

    public ArrayList<Contract> getContract() {
        return contract;
    }

    public void setContract(Contract contracts) {
       this.contract.add(contracts);
    }

    @Override
    public String toString() {
        return "\nWorker {" +
                "\n name: '" + name + '\'' +
                "\n level: " + level +
                "\n baseSalary: R$" + new DecimalFormat("0.00").format(baseSalary) +
                "\n Contracts: "+ getContract() +
                "\n}";
    }
}
