package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex7 {
    public static void main(String[] args) {
        String text = "Напишите функцию, которая принимает на вход список строк " +
                "и возвращает новый список, содержащий только те строки, " +
                "которые имеют длину больше заданного значения.";

        List<String> wordList = List.of(text.split(" "));
        System.out.println("\nРезультат разделения строки:");
        for (String word : wordList) {
            System.out.println(word);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите минимальную длину строки: ");
        int minLength = scanner.nextInt();

        List<String> filteredStrings = filterByLength(wordList, minLength);
        System.out.println("\nОтфильтрованный список:");
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }

    public static List<String> filterByLength(List<String> list, int length) {
        return list.stream()
                .filter(s -> s.length() > length)
                .collect(Collectors.toList());
    }
}

