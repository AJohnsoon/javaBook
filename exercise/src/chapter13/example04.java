package chapter13;

import chapter13.entities.enums.OrderStatus;
import chapter13.entities.example04.Client;
import chapter13.entities.example04.Order;
import chapter13.entities.example04.OrderItem;
import chapter13.entities.example04.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class example04 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy");
        Date date =  new Date();

        Client client1 = new Client("example", "example@test.com", stf.parse("20/02/2000"));
        Order order1 = new Order(date, OrderStatus.valueOf("PROCESSING_PAYMENT"));
        OrderItem item = new OrderItem(15,1200.00);
        Product p1 = new Product("TV", 1600);
        Product p2 = new Product("PC", 2500);
        item.addProd(p1);
        item.addProd(p2);
        order1.addItem(item);
        client1.makeOrder(order1);

        System.out.println(client1);
    }
}
