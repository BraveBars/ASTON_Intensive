package ru.aston.matveenko_ym.task1.product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Собрать продукты в Stream в таблицу, где каждая строка — это информация о продукте (название, категория, стоимость),
 * отсортированную по категории продукта.
 */
public class ProductTable {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Apple", "Fruit", 1.2),
                new Product("Carrot", "Vegetable", 0.8),
                new Product("Banana", "Fruit", 1.1),
                new Product("Broccoli", "Vegetable", 1.5),
                new Product("Chicken", "Meat", 5.0)
        );

        String tableHeader = String.format("%-15s %-15s %s", "Name", "Category", "Price");
        System.out.println(tableHeader);
        System.out.println("-".repeat(tableHeader.length()));

        products.stream()
                .sorted(Comparator.comparing(Product::category)) // сортировка по категории продукта
                .forEach(System.out::println);
    }
}