package ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_order_factory;

import ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_products.Payment;
import ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_products.Product;

public interface OrderFactory {

    Product createProduct(String type, String name);
    Payment createPayment(String type);
}