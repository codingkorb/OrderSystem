package de.neuefisch;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@AllArgsConstructor
@Data
public class ProductRepo {


    private Map<Integer, Product> products = Map.of(
            1, new Product(1, "Product1"),
            1, new Product(2, "Product2"),
            1, new Product(3, "Product3"),
            1, new Product(4, "Product4")

    )

    public Product getProduct(int productKey) {
        return products.get(productKey);
    }


   /* private Proucts[] products;

    public void get(Product product) {
        Product[] newProduct = new Product[




                products.length +1];
        {
    }*/›› 

}
