package ru.aston.matveenko_ym.task3.concrete_payment;

import ru.aston.matveenko_ym.task3.abstract_products.Payment;

public class PayPalPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal: " + amount + " руб.");
    }
}