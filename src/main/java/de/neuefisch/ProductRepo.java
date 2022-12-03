package de.neuefisch;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;


@Data
public class ProductRepo() {


    private Map<Integer, Product> products = Map.of(
            1, new Product(1, "Product1"),
            2, new Product(2, "Product2"),
            3, new Product(3, "Product3"),
            4, new Product(4, "Product4"),
            5, new Product(5, "Product5"),
            6, new Product(6, "Product6"),
            7, new Product(7, "Product7")

    );

    public Product getProduct(int productKey) {
        return products.get(productKey);
    }


   /* private Products[] products;

    public void get(Product product) {
        Product[] newProduct = new Product[




                products.length +1];
        {
    }*/

}
