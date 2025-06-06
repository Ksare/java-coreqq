package Timus;

import java.util.Scanner;

public class timus1910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение размера массива
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Заполнение массива
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        // Поиск максимальной суммы трех соседних элементов
        int maxSum = 0;
        int middleIndex = 0;

        // Проходим по массиву, начиная со второго элемента и до предпоследнего
        for (int i = 1; i < n - 1; i++) {
            // Вычисляем сумму трех соседних элементов
            int sum = array[i - 1] + array[i] + array[i + 1];

            // Обновляем максимальную сумму и индекс, если нашли большую сумму
            if (sum > maxSum) {
                maxSum = sum;
                middleIndex = i;
            }
        }

        // Выводим результат: максимальную сумму и позицию среднего элемента
        System.out.println(maxSum + " " + (middleIndex + 1));
    }
}


