package ru.aston.matveenko_ym.task1;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Собрать элементы Stream в карту, где ключом будет первая буква каждого слова, а значением — само слово.
 * Отсортировать ключи в алфавитном порядке.
 */
public class WordsToMap {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apricot", "blueberry", "cherry"};

        Map<Character, String> resultMap = Arrays.stream(words)
                .collect(Collectors.toMap(
                        w -> w.charAt(0), // ключ - первая буква слова
                        w -> w, // значение - само слово
                        (existing, replacement) -> existing, // обработка коллизий (если ключ уже существует)
                        TreeMap::new // TreeMap для автоматической сортировки ключей
                ));

        System.out.println("Карта: " + resultMap);
    }
}