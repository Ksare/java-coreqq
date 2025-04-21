package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex5 {
    public static void main(String[] args) {
        String paragraph = "Напишите функцию, которая принимает на вход список строк " +
                "и возвращает новый список, содержащий только те строки, " +
                "которые содержат заданную подстроку.\n";

        List<String> wordList = List.of(paragraph.split(" "));
        System.out.println("\nИсходный список:");
        for (String word : wordList) {
            System.out.println(word);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите подстроку для поиска: ");
        String searchSubstr = scanner.nextLine();

        // Вызов функции для фильтрации по подстроке
        List<String> filteredList = filterBySubstring(wordList, searchSubstr);

        System.out.println("\nОтфильтрованный список:");
        for (String item : filteredList) {
            System.out.println(item);
        }
    }

    // Функция возвращает новый список, содержащий только строки, которые содержат подстроку
    public static List<String> filterBySubstring(List<String> input, String substring) {
        return input.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}

