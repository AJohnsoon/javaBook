package chapter13.entities;

import chapter13.entities.enums.WorkerLevel;

import java.awt.font.TextHitInfo;
import java.text.DecimalFormat;


public class Worker {
    private String name;
    private WorkerLevel level;
    private  double baseSalary;


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

    @Override
    public String toString() {
        return "Worker {" +
                "\nname: '" + name + '\'' +
                "\nlevel: " + level +
                "\nbaseSalary: R$" + new DecimalFormat("0.00").format(baseSalary) +
                "\n}";
    }
}
