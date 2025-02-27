package ru.aston.matveenko_ym.task1.product;

public record Product(String name, String category, double price) {

    @Override
    public String toString() {
        return String.format("%-15s %-15s %.2f", name, category, price);
    }
}