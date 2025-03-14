package ru.aston.matveenko_ym.patterns.creational.abstract_factory.client;

import ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_order_factory.OrderFactory;
import ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_products.Payment;
import ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_products.Product;

public class OrderManager {
    private final Product product;
    private final Payment payment;

    public OrderManager(OrderFactory factory, String productType, String productName, String paymentType) {
        this.product = factory.createProduct(productType, productName);
        this.payment = factory.createPayment(paymentType);
    }

    public void placeOrder(double amount) {
        product.displayInfo();
        payment.processPayment(amount);
    }
}