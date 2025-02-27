package ru.aston.matveenko_ym.task1;

import java.util.Arrays;

/**
 * Посчитать сумму чисел в массиве [1, 2, 3, 4, 5], используя reduce().
 */
public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(numbers)
                .reduce(0, Integer::sum);

        System.out.println("Сумма: " + sum);
    }
}