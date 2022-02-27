package oop.withOop.entities;

public class Triangle {
    public double sideA;
    public double sideB;
    public double sideC;

    public double Area(){
        double perimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
    }
}
