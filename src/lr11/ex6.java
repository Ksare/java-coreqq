package lr11;

import java.util.*;
import java.util.stream.Collectors;

public class ex6 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        System.out.println("\nИсходный список:");
        for (int i = 0; i < 10; i++) {
            int value = rand.nextInt(1000);
            numbers.add(value);
            System.out.println(value);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите делитель: ");
        int divider = scanner.nextInt();

        List<Integer> divisibleNumbers = filterDivisible(numbers, divider);

        System.out.println("\nОтфильтрованный список:");
        for (int num : divisibleNumbers) {
            System.out.println(num);
        }
    }

    public static List<Integer> filterDivisible(List<Integer> list, int divisor) {
        return list.stream()
                .filter(x -> x % divisor == 0)
                .collect(Collectors.toList());
    }
}

