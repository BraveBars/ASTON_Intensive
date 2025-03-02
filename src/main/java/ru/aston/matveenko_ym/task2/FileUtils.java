package ru.aston.matveenko_ym.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    /**
     * Метод, который читает текстовый файл и возвращает его в виде списка строк.
     *
     * @param filePath - путь к текстовому файлу .txt
     * @return - возвращает список строк
     * @throws IOException - проброс исключения ввода-вывода
     */
    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    /**
     * Метод, который записывает в файл список строк, переданный параметром.
     */
    public static void writeFile(String filePath, List<String> content) throws IOException {
        Files.write(Paths.get(filePath), content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    /**
     * Метод, который записывает в файл одну строку, переданную параметром.
     */
    public static void writeFile(String filePath, String content) throws IOException {
        writeFile(filePath, List.of(content));
    }

    /**
     * Метод, который склеивает два текстовых файла в один.
     */
    public static void mergeFiles(String file1Path, String file2Path, String outputFilePath) throws IOException {
        // Читаем содержимое обоих файлов.
        List<String> file1Content = readFile(file1Path);
        List<String> file2Content = readFile(file2Path);

        // Объединяем содержимое обоих файлов.
        List<String> mergedContent = new ArrayList<>();
        mergedContent.addAll(file1Content);
        mergedContent.addAll(file2Content);

        // Записываем результат в файл.
        writeFile(outputFilePath, mergedContent);
    }

    /**
     * Метод, который заменяет в файле всё, кроме букв и цифр, на знак ‘$’.
     */
    public static void replaceNonAlphanumeric(String filePath) throws IOException {
        // Читаем строки из файла.
        List<String> lines = readFile(filePath);

        // Преобразуем каждую строку, где заменяем всё, кроме букв и цифр, на знак ‘$’.
        List<String> updatedLines = new ArrayList<>();
        for (String line : lines) {
            updatedLines.add(line.replaceAll("[^a-zA-Zа-яА-Я0-9]", "\\$"));
        }

        // Записываем обновленные строки обратно в файл.
        writeFile(filePath, updatedLines);
    }
}