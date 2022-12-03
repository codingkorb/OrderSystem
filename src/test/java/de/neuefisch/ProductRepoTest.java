package de.neuefisch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {
@Test
    void testGetProductToReturnProduct(){

    ProductRepo repoTest = new ProductRepo();
   Product result = repoTest.getProduct(1);
   // assertEquals(new Product(1, "Product1"), result);
    assertEquals(1, result.getProductId());
    assertEquals("Product1", result.getProductName());
}
}