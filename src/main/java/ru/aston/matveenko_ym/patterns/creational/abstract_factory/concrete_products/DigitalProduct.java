package ru.aston.matveenko_ym.patterns.creational.abstract_factory.concrete_products;

import ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_products.Product;

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