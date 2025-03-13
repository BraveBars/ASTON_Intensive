package ru.aston.matveenko_ym.task3.concrete_payment;

import ru.aston.matveenko_ym.task3.abstract_products.Payment;

public class CreditCardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата кредитной картой: " + amount + " руб.");
    }
}