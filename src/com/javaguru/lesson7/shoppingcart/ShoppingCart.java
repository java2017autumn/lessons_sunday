package com.javaguru.lesson7.shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Product, Integer> products = new HashMap<>();

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        if (products.containsKey(product)) {
            int count = products.get(product);
            count++;
            products.put(product, count);
        } else {
            products.put(product, 1);
        }
    }

    public void printProducts() {
        products.entrySet().forEach(System.out::println);
    }
}
