package ru.aston.matveenko_ym.task1;

import java.util.Arrays;

/**
 * Отсортировать элементы массива [5, 9, 1, 7, 3] по возрастанию.
 */
public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 1, 7, 3};

        int[] sortedNumbers = Arrays.stream(numbers)
                .sorted()
                .toArray();

        System.out.println("Отсортированный массив: " + Arrays.toString(sortedNumbers));
    }
}