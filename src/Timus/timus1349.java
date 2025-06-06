package Timus;

import java.util.Scanner;

public class timus1349 {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        int power = numberInput.nextInt();
        numberInput.close();

        // Нет решений для нулевой степени
        if (power == 0) {
            System.out.println(-1);
            return;
        }

        // Поиск минимального решения в диапазоне 1-100
        boolean solutionFound = false;
        for (int a = 1; a <= 100 && !solutionFound; a++) {
            for (int b = a + 1; b <= 100 && !solutionFound; b++) {
                for (int c = b + 1; c <= 100; c++) {
                    if (Math.pow(a, power) + Math.pow(b, power) == Math.pow(c, power)) {
                        System.out.println(a + " " + b + " " + c);
                        solutionFound = true;
                        break; // Прекращаем поиск после нахождения первого решения
                    }
                }
            }
        }

        // Если решение не найдено
        if (!solutionFound) {
            System.out.println(-1);
        }
    }
}
