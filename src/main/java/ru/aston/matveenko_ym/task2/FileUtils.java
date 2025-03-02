package ru.aston.matveenko_ym.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    /**
     * Метод, который записывает в файл список строк, переданный параметром.
     */
    public static void writeFile(String filePath, List<String> content) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath),
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
            for (String line : content) {
                writer.write(line);
                writer.newLine();
            }
        }
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
        List<String> updatedLines = new ArrayList<>();
        Path path = Paths.get(filePath);

        // Читаем файл и преобразуем каждую строку, где заменяем всё, кроме букв и цифр, на знак ‘$’.
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                updatedLines.add(line.replaceAll("[^a-zA-Zа-яА-Я0-9]", "\\$"));
            }
        }

        // Записываем обновленный файл.
        try (BufferedWriter writer = Files.newBufferedWriter(path,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
            for (String line : updatedLines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}