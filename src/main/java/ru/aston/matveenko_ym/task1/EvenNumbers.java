package ru.aston.matveenko_ym.task1;

import java.util.stream.IntStream;

/**
 * Вывести все чётные числа в диапазоне от 1 до 100.
 */
public class EvenNumbers {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}