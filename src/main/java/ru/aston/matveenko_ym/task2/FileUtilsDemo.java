package ru.aston.matveenko_ym.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class FileUtilsDemo {
    public static void main(String[] args) {
        final Logger log = LoggerFactory.getLogger(FileUtilsDemo.class);
        final String FILE_PATH_INPUT = ".\\src\\main\\resources\\files\\input.txt";
        final String FILE_PATH_OUTPUT = ".\\src\\main\\resources\\files\\output.txt";
        final String FILE1_PATH = ".\\src\\main\\resources\\files\\file1.txt";
        final String FILE2_PATH = ".\\src\\main\\resources\\files\\file2.txt";
        final String FILE_PATH_MERGED = ".\\src\\main\\resources\\files\\merged.txt";

        try {
            // Чтение файла.
            List<String> lines = FileUtils.readFile(FILE_PATH_INPUT);
            System.out.println("Содержимое файла 'input.txt': \n");
            lines.forEach(System.out::println);
            System.out.println("---------------------------------------------------------------");

            // Запись строки в файл.
            FileUtils.writeFile(FILE_PATH_OUTPUT, "Привет, мир!\n");

            // Склеивание двух файлов.
            FileUtils.mergeFiles(FILE1_PATH, FILE2_PATH, FILE_PATH_MERGED);

            // Замена символов в файле, кроме букв и цифр.
            FileUtils.replaceNonAlphanumeric(FILE_PATH_INPUT, '$');
            System.out.println("Файл 'input.txt' обработан (замена символов)!");

        } catch (IOException ioException) {
            log.error("Error reading from file or writing to file!", ioException);
        }
    }
}