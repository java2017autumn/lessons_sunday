package com.javaguru.lesson7.shoppingcart;

import java.math.BigDecimal;
import java.util.Map;

public class ShoppingCartMain {

    public static void main(String[] args) {
        Product milk = new Product();
        milk.setName("Milk");
        milk.setPrice(new BigDecimal("0.79"));
        milk.setWeight(1000D);
        milk.setType(ProductType.MILK);

        Product apple = new Product("Apple", new BigDecimal("2"),
                1000D, ProductType.FRUIT);

        Product carrot = new Product("Carrot", new BigDecimal("1.50"),
                1000D, ProductType.VEGETABLE);

        Product banana = new Product("Banana", new BigDecimal("0.99"),
                1000D, ProductType.FRUIT);

        ShoppingCart cart = new ShoppingCart();

        System.out.println(cart.getProducts());

        cart.addProduct(apple);
        cart.addProduct(apple);
        cart.addProduct(apple);
        cart.addProduct(apple);

        cart.addProduct(milk);
        cart.addProduct(milk);
        cart.addProduct(milk);

        cart.addProduct(carrot);

        cart.addProduct(banana);
        cart.addProduct(banana);
        cart.addProduct(banana);
        cart.addProduct(banana);
        cart.addProduct(banana);
        cart.addProduct(banana);

        cart.printProducts();

        cart.getProducts().entrySet().stream()
                .filter(entry -> entry.getKey().getType() == ProductType.FRUIT)
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
