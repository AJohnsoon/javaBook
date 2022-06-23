package chapter13.entities;

import java.text.DecimalFormat;
import java.util.Date;

public class HourContract {
    private Date date;
    private double valuePerHour;
    private int hour;

    public HourContract(){}

    public HourContract(Date date, double valuePerHour, int hour){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Double totalValue(){
        return valuePerHour * hour;
    }

    @Override
    public String toString() {
        return "HourContract {" +
                "\ndate: " + date +
                "\nvaluePerHour: " + valuePerHour +
                "\nhour: " + hour +
                "\ntotalValue: "+ new DecimalFormat("0.00").format(totalValue()) +
                "}";
    }
}
