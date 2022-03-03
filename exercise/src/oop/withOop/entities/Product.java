package oop.withOop.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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
                "name: '" + name + '\'' +
                ", price: U$" + String.format("%.2f", price) +
                ", quantity: " + quantity +
                ", Total: U$" + String.format("%.2f", TotalValueInStock()) +
                " }";
    }
}
