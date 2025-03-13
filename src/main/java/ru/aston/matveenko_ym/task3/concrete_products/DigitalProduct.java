package ru.aston.matveenko_ym.task3.concrete_products;

import ru.aston.matveenko_ym.task3.abstract_products.Product;

public class DigitalProduct implements Product {
    private final String name;

    public DigitalProduct(String name) {
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println("Электронный продукт: " + name);
    }
}