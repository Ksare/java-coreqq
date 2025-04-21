package lr11;

import java.util.List;
import java.util.stream.Collectors;


public class ex9 {
    public static void main(String[] args) {
        String text = "Напишите функцию 3которая принимает на вход список строк и " +
                "возвращает только буквы без цифр и символов ! @#%$%^&*()";

        List<String> originalStrings = List.of(text.split(" "));
        System.out.println("\nРезультат разделения строки:");
        for (String word : originalStrings) {
            System.out.println(word);
        }

        List<String> filteredStrings = filterLettersOnly(originalStrings);
        System.out.println("\nПосле фильтрации (только буквы):");
        for (String word : filteredStrings) {
            System.out.println(word);
        }
    }

    public static List<String> filterLettersOnly(List<String> list) {
        // Оставляем только слова, состоящие из букв
        return list.stream()
                .filter(s -> s.matches("\\p{L}+"))
                .collect(Collectors.toList());
    }
    }

