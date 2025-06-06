package Timus;

import java.util.Scanner;

public class timus1402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество ингредиентов (1 ≤ n ≤ 21) в командной строке: ");
        int n = scanner.nextInt();
        scanner.close();

        // Проверяем ограничения
        if (n < 1 || n > 21) {
            System.out.println("Ошибка: количество должно быть в диапазоне от 1 до 21.");
            return;
        }

        long cocktailCount = 0;

        // Рассчитываем количество коктейлей для m от 2 до n
        for (int m = 2; m <= n; m++) {
            cocktailCount += calculateCombinations(n, m);
        }

        // Выводим итоговое количество коктейлей
        System.out.println("Общее число возможных коктейлей: " + cocktailCount);
    }

    // Метод для расчета количества комбинаций
    private static long calculateCombinations(int total, int select) {
        long combinationResult = 1;
        for (int j = 0; j < select; j++) {
            combinationResult *= (total - j);
        }
        return combinationResult;
    }
}

