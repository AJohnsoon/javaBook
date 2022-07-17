package chapter14.entities.example07.entities;

import chapter14.entities.example07.enums.Color;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "\n width:" + width +
                "\n height:" + height +
                "\n area: " + String.format("%.2f", area()) +
                "\n}";
    }
}
