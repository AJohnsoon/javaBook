package chapter13.entities.example04;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private double price;

    private List<Product> prod = new ArrayList<>();


    public OrderItem(){}

    public OrderItem(Integer quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Product> getProd() {
        return prod;
    }

    public void addProd(Product product){
        prod.add(product);
    }

    public Double subTotal(){
        return price*quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{" );
        sb.append("\n       Quantity: " + quantity);
        sb.append("\n       Price: " + price);
        sb.append("\n       SubTotal: "+ subTotal());
        sb.append("\n       Product: " + prod);
        sb.append("\n    }");

        return sb.toString();
    }
}
