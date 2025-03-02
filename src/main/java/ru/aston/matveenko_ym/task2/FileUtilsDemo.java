package ru.aston.matveenko_ym.task2;

import java.io.IOException;
import java.util.List;

public class FileUtilsDemo {
    public static void main(String[] args) {
        try {
            // Чтение файла
            List<String> lines = FileUtils.readFile(".\\src\\main\\resources\\input.txt");
            System.out.println("Содержимое файла 'input.txt': \n");
            lines.forEach(System.out::println);
            System.out.println("---------------------------------------------------------------");

            // Запись строки в файл
            FileUtils.writeFile(".\\src\\main\\resources\\output.txt", "Привет, мир!\n");

            // Склеивание двух файлов
            FileUtils.mergeFiles(".\\src\\main\\resources\\file1.txt",
                    ".\\src\\main\\resources\\file2.txt", ".\\src\\main\\resources\\merged.txt");

            // Замена символов в файле
            FileUtils.replaceNonAlphanumeric(".\\src\\main\\resources\\input.txt");
            System.out.println("Файл 'input.txt' обработан (замена символов).");
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}