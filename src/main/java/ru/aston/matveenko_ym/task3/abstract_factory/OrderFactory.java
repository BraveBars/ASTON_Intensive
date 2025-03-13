package ru.aston.matveenko_ym.task3.abstract_factory;

import ru.aston.matveenko_ym.task3.abstract_products.Payment;
import ru.aston.matveenko_ym.task3.abstract_products.Product;

public interface OrderFactory {

    Product createProduct(String type, String name);
    Payment createPayment(String type);
}