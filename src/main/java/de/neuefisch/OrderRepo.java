package de.neuefisch;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
@Data
@AllArgsConstructor

public class OrderRepo {
           //  die eine Order Liste enthält
    //List
    private Map<Integer, Order> orders = new HashMap<>();

    //Get


    public Order getOrder(int orderKey) {
        return orders.get(orderKey);

    }
    public void add(Order order) {
        orders.put(order.getOrderId(), order);
    }
}
