package de.neuefisch;

import java.util.Map;

public class ShopService {

    //über die wir eine neue Order aufgeben können.

    private ProductRepo productRepo;

    private OrderRepo orderRepo;



   // getProduct() {
   public ProductRepo getProduct() {
       return orders.get(orderKey);

    public Map<Integer, Product> listOfAllProducts();
        return this.productRepo.getProducts();
    }

    //addOrder() {
       public Product listProduct() {
           return orders.get(orderKey);

           public Map<Integer, Product> listProduct();
           return this.product.listProducts();
    }
       private Order addOrder() {
           return orders.get(orderKey);

           public Map<Integer, Order> addOrder();
           return this.order.addOrder();
       }

        private Order getOrder() {
            return orders.get(orderKey);

            public Map<Integer, Order> getOrder();
            return this.order.getOrder();
 }
    public Order listOrders(){
        return orders.get(orderKey);

        public Map<Integer, Order> listOrders();
        return this.order.listOrders();
    }
    //public Map<Integer, Order>listOfAllOrders() {
    //    return this.orderRepo.getOrders();
   }
