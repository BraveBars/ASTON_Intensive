package ru.aston.matveenko_ym.patterns.creational.abstract_factory.concrete_payment;

import ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_products.Payment;

public class PayPalPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal: " + amount + " руб.");
    }
}