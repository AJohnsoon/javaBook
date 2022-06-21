package chapter13;

import chapter13.entities.Order;
import chapter13.entities.enums.OrderStatus;

import java.util.Date;

public class example01 {

    public static void main(String[] args){
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus pending = OrderStatus.PENDING_PAYMENT;
        OrderStatus processing = OrderStatus.valueOf("PROCESSING_PAYMENT");
        OrderStatus shipped = OrderStatus.valueOf("SHIPPED");
        OrderStatus delivered = OrderStatus.DELIVERED;

        System.out.println("Status: "+pending);
        System.out.println("Status: "+processing);
        System.out.println("Status: "+shipped);
        System.out.println("Status: "+delivered);


    }

}
