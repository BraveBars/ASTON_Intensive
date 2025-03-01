package ru.aston.matveenko_ym.task1;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Для любого набора случайно сгенерированных чисел нужно определить количество парных.
 * Для решения задачи использовать средства программного интерфейса Stream API.
 */
public class PairCounter {
    public static void main(String[] args) {
        Random random = new SecureRandom();
        // 20 случайных чисел от 1 до 10
        List<Integer> numbers = random.ints(20, 1, 10)
                .boxed() // преобразуем IntStream в Stream<Integer>
                .toList();

        System.out.println("Случайно сгенерированные числа: " + numbers);

        long pairCount = numbers.stream()
                // создаем Map (ключи - числа, а значения — количество чисел)
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .values().stream() // получаем значения из Map (количество каждого числа)
                .mapToLong(count -> count / 2) // каждые 2 числа образуют пару
                .sum(); // суммируем количество пар

        System.out.println("Количество парных чисел: " + pairCount);
    }
}