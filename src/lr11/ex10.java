package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex10 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random randGen = new Random();

        System.out.println("\nНачальный список:");
        for (int i = 0; i < 10; i++) {
            int value = randGen.nextInt(1000);
            numbers.add(value);
            System.out.println(value);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для сравнения: ");
        int threshold = scanner.nextInt();

        List<Integer> filteredNumbers = filterLessThan(numbers, threshold);

        System.out.println("\nСписок чисел меньше заданного значения:");
        for (Integer num : filteredNumbers) {
            System.out.println(num);
        }
    }

    public static List<Integer> filterLessThan(List<Integer> list, int limit) {
        return list.stream()
                .filter(x -> x < limit)
                .collect(Collectors.toList());
    }
}

