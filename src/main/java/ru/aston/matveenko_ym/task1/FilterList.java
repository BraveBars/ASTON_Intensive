package ru.aston.matveenko_ym.task1;

import java.util.Arrays;
import java.util.List;

/**
 * Выведите на экран элементы списка, которые не входят в другой список.
 */
public class FilterList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> result = list1.stream()
                .filter(n -> !list2.contains(n))
                .toList();

        System.out.println("Элементы первого списка list1, которые не входят во второй список list2: " + result);
    }
}