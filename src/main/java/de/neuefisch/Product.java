package de.neuefisch;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data@AllArgsConstructor

public class Product {

        private int productId;
        private String productName;


   /* List<Product> productList = new ArrayList<>()
         productList.add(product1);
         productList.add(product2);
         productList.add(product3);
         productList.add(product4);
*/
}
