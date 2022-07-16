package chapter14.entities;

public class OutsourceEmployee extends Employee{
    private Double additionalCharge;

    public OutsourceEmployee(){}

    public OutsourceEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double Payment() {
        return super.Payment() + ((additionalCharge * 110)/100);
    }

    @Override
    public String toString() {
        return "\nOutsourceEmployee {" +
                "\n name: " + this.getName() +
                "\n hours: " + this.getHours() +
                "\n valuePerHour: " + this.getValuePerHour() +
                "\n Payment: $"+ Payment()+
                "\n additionalCharge: " + additionalCharge +
                "\n }";
    }
}
