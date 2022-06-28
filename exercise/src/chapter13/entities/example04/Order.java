package chapter13.entities.example04;

import chapter13.entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment = new Date();
    private OrderStatus status;

    private List<OrderItem> orderItem = new ArrayList<>();

    public Order(){}

    public Order(Date moment, OrderStatus status){
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){
        orderItem.add(item);
    }

    public void removeItem(OrderItem item){
        orderItem.remove(item);
    }

    public Double totalPrice(){
        double total = 0;
        for (OrderItem ord: orderItem) {
            for (Product prod : ord.getProd()){
                total = ord.subTotal() + prod.getPrice();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\n    moment: " + moment);
        sb.append("\n    status: " + status );
        sb.append("\n    orderItem: " + orderItem);
        sb.append("\n    Total: " + totalPrice());
        sb.append("\n   }");

        return sb.toString();
    }
}
