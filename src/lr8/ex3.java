package lr8;

import java.io.*;
import java.util.*;

public class ex3 {
    private static final Set<Character> VOWELS = new HashSet<>(Arrays.asList(
            'а', 'е', 'ё', 'и', 'о', 'у', 'э', 'ю', 'я',
            'А', 'Е', 'Ё', 'И', 'О', 'У', 'Э', 'Ю', 'Я'
    ));

    public static void main(String[] args) {
        try {
            // Создаем исходный файл с примером текста
            createInputFile();

            // Читаем исходный файл
            List<String> lines = readFile("input.txt");

            // Создаем результирующий файл
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

                for (int i = 0; i < lines.size(); i++) {
                    String line = lines.get(i);
                    String[] words = line.split("\\s+");

                    List<String> selectedWords = new ArrayList<>();

                    for (String word : words) {
                        if (!word.isEmpty() && !VOWELS.contains(word.charAt(0))) {
                            selectedWords.add(word);
                        }
                    }

                    if (!selectedWords.isEmpty()) {
                        writer.write("Строка " + (i + 1) + ":\n");
                        writer.write("Количество слов: " + selectedWords.size() + "\n");
                        writer.write(String.join(" ", selectedWords) + "\n\n");
                    }
                }
            }

            System.out.println("Обработка завершена. Результат записан в output.txt");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлами: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void createInputFile() throws IOException {
        String exampleText = "Буря мглою небо кроет\n" +
                "Вихри снежные крутя,\n" +
                "То, как зверь, она завоет,\n" +
                "То заплачет, как дитя,\n" +
                "То по кровле обветшалой\n" +
                "Вдруг соломой зашумит,\n" +
                "То как путник запоздалый\n" +
                "К нам в окошко застучит.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"))) {
            writer.write(exampleText);
        }
    }

    private static List<String> readFile(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}



