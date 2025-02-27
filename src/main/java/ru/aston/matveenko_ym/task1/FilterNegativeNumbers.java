package ru.aston.matveenko_ym.task1;

import java.util.Arrays;
import java.util.List;

/**
 * Отфильтруйте все элементы списка, которые меньше 0.
 */
public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, 3, -1, 7, 0, -2, 4, 8);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n >= 0)
                .toList();

        System.out.println("Отфильтрованный список: " + filteredNumbers);
    }
}