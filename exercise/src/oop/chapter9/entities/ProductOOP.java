package oop.chapter9.entities;

public class ProductOOP {
    private String name;
    private double price;
    private int quantity;

    public ProductOOP() {
    }

    public ProductOOP(String name) {
        this.name = name;
    }

    public ProductOOP(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public ProductOOP(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double TotalValueInStock() {
        return price * quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        if (this.quantity < quantity) {
            System.out.println("you can't remove quantity" +
                    "(quantity greater than in stock) ");
        } else {
            this.quantity -= quantity;
        }
    }

    @Override
    public String toString() {
        return "Product data: { " +
                "name: '" + this.getName() + '\'' +
                ", price: U$" + String.format("%.2f", this.getPrice()) +
                ", quantity: " + this.getQuantity() +
                ", Total: U$" + String.format("%.2f", this.TotalValueInStock()) +
                " }";
    }
}
