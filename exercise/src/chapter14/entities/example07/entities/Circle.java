package chapter14.entities.example07.entities;

import chapter14.entities.example07.enums.Color;

public class Circle extends Shape{

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "\nCircle {" +
                "\n radius:" + radius +
                "\n area: " + String.format("%.2f", area()) +
                "\n }";
    }
}
