package ru.aston.matveenko_ym.task1;

import java.util.stream.IntStream;

/**
 * Создать три стрима из массивов чисел от 1 до 10, от 10 до 20 и от 20 до 30 соответственно.
 * Объединить их в один стрим и вывести числа, которые кратны 5.
 */
public class StreamExample {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.rangeClosed(1, 10);
        IntStream stream2 = IntStream.rangeClosed(10, 20);
        IntStream stream3 = IntStream.rangeClosed(20, 30);

        IntStream.concat(stream1, IntStream.concat(stream2, stream3))
                .distinct()
                .filter(n -> n % 5 == 0)
                .forEach(System.out::println);
    }
}