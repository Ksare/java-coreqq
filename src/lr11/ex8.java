package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ex8 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Random randGen = new Random();

        System.out.println("\nНачальный список:");
        for (int i = 0; i < 10; i++) {
            int value = randGen.nextInt(1000);
            numberList.add(value);
            System.out.println(value);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для сравнения: ");
        int threshold = scanner.nextInt();

        List<Integer> filteredList = filterGreaterThan(numberList, threshold);

        System.out.println("\nЧисла больше заданного значения:");
        for (Integer num : filteredList) {
            System.out.println(num);
        }
    }

    public static List<Integer> filterGreaterThan(List<Integer> list, int limit) {
        return list.stream()
                .filter(x -> x > limit)
                .collect(Collectors.toList());
    }
}

