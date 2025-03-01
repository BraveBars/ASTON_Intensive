package ru.aston.matveenko_ym.task1.product;

import java.util.Arrays;
import java.util.List;

/**
 * Создание Stream объектов и поиск всех объектов, у которых определенное поле равно определенному значению.
 */
public class StreamFilterExample {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Apple", "Fruit", 1.2),
                new Product("Banana", "Fruit", 1.1),
                new Product("Carrot", "Vegetable", 0.8),
                new Product("Broccoli", "Vegetable", 1.5),
                new Product("Chicken", "Meat", 5.0)
        );

        String targetCategory = "Fruit"; // категория для поиска

        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getCategory().equals(targetCategory)) // фильтрация по категории
                .toList();

        System.out.println("Продукты в категории " + targetCategory + ":");
        filteredProducts.forEach(System.out::println);
    }
}