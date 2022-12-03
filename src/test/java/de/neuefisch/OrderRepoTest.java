package de.neuefisch;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {
@Test
    void newGetOrderEqualsToNonExistingOrder(){
    Map<Integer, Order> orders = new HashMap<>();
    OrderRepo orderKey = new OrderRepo(orders);
    Order result = orderKey.getOrder(15);
    assertEquals(null, result);

}
@Test
void newGetOrderEqualsOrderKey(){
    Map<Integer, Order> orders = new HashMap<>();
    orders.put(1,new Order(33));
    OrderRepo orderKey = new OrderRepo(orders);
    Order result = orderKey.getOrder(15);
    assertEquals(null, result);
}

