package ru.aston.matveenko_ym.patterns.creational.abstract_factory;

import ru.aston.matveenko_ym.patterns.creational.abstract_factory.abstract_order_factory.OrderFactory;
import ru.aston.matveenko_ym.patterns.creational.abstract_factory.client.OrderManager;
import ru.aston.matveenko_ym.patterns.creational.abstract_factory.concrete_factories.DigitalOrderFactory;
import ru.aston.matveenko_ym.patterns.creational.abstract_factory.concrete_factories.PhysicalOrderFactory;

public class OnlineStore {

    public static void main(String[] args) {
        OrderFactory digitalFactory = new DigitalOrderFactory();
        OrderManager digitalOrder = new OrderManager(digitalFactory, "DIGITAL", "Электронная книга", "CREDIT");
        digitalOrder.placeOrder(500);
        System.out.println("--------------------------------------");
        OrderFactory physicalFactory = new PhysicalOrderFactory();
        OrderManager physicalOrder = new OrderManager(physicalFactory, "PHYSICAL", "Физическая книга", "PAYPAL");
        physicalOrder.placeOrder(800);
    }
}