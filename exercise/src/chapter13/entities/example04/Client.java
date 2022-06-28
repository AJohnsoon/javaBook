package chapter13.entities.example04;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
    private String name;
    private String email;
    private Date birthDate;

    private List<Order> orderList = new ArrayList<>();

    public Client(){}

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void makeOrder(Order order){
        orderList.add(order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client {");
        sb.append("\n name: " + name );
        sb.append("\n email: " + email );
        sb.append("\n birthDate: "+ birthDate );
        sb.append("\n orderList: " + orderList);
        sb.append("\n}");
        return sb.toString();
    }
}
