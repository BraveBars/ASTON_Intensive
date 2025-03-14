package ru.aston.matveenko_ym.patterns.creational.abstract_factory.concrete_factories;

import ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_order_factory.OrderFactory;
import ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_products.Payment;
import ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_products.Product;
import ru.aston.matveenko_ym.patterns.creational.abstract_factory.concrete_payment.CreditCardPayment;
import ru.aston.matveenko_ym.patterns.creational.abstract_factory.concrete_payment.PayPalPayment;
import ru.aston.matveenko_ym.patterns.creational.abstract_factory.concrete_products.PhysicalProduct;

public class PhysicalOrderFactory implements OrderFactory {

    @Override
    public Product createProduct(String type, String name) {
        return new PhysicalProduct(name);
    }

    @Override
    public Payment createPayment(String type) {
        if (type.equalsIgnoreCase("CREDIT")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("PAYPAL")) {
            return new PayPalPayment();
        }
        return null;
    }
}