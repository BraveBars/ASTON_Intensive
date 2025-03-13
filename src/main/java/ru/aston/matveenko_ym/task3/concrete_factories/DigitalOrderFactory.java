package ru.aston.matveenko_ym.task3.concrete_factories;

import ru.aston.matveenko_ym.task3.abstract_factory.OrderFactory;
import ru.aston.matveenko_ym.task3.abstract_products.Payment;
import ru.aston.matveenko_ym.task3.abstract_products.Product;
import ru.aston.matveenko_ym.task3.concrete_payment.CreditCardPayment;
import ru.aston.matveenko_ym.task3.concrete_payment.PayPalPayment;
import ru.aston.matveenko_ym.task3.concrete_products.DigitalProduct;

public class DigitalOrderFactory implements OrderFactory {

    @Override
    public Product createProduct(String type, String name) {
        return new DigitalProduct(name);
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