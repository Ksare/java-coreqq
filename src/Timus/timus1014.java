package Timus;

import java.util.Scanner;

public class timus1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.println(findMinimalNumber(N));
    }

    private static long findMinimalNumber(long N) {
        // Базовые случаи
        if (N == 0) return 10;
        if (N < 10) return N;

        StringBuilder result = new StringBuilder();

        // Начинаем с наибольшей цифры и идем вниз
        for (int digit = 9; digit > 1; digit--) {
            while (N % digit == 0) {
                result.insert(0, digit);
                N /= digit;
            }
        }

        // Если N не разложилось полностью
        if (N > 1) return -1;

        return Long.parseLong(result.toString());
    }
}


