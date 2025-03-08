package lr8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        try {
            // Создаем исходный файл с данными
            createSourceFile();

            // Читаем данные из исходного файла
            List<String> lines = readFile("source.txt");

            // Создаем результирующий файл
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("result.txt"), "UTF-8"))) {

                // Записываем вторую строку
                writer.write(lines.get(1));
                writer.write("\n");

                // Разбираем числа и записываем положительные
                String[] numbers = lines.get(2).split(" ");
                for (String num : numbers) {
                    double value = Double.parseDouble(num);
                    if (value > 0) {
                        writer.write(value + " ");
                    }
                }
            }
            System.out.println("Обработка завершена. Результат записан в result.txt");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлами: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void createSourceFile() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("source.txt"), "UTF-8"))) {
            writer.write("Первая строка\n");
            writer.write("Вторая строка\n");
            writer.write("-1.5 2.7 -3.0 4.2 1.9");
        }
    }

    private static List<String> readFile(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}

