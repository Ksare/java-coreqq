package lr13;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ex15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = null;
            int size = 0;

            // Ввод размера массива с обработкой ошибок
            while (true) {
                try {
                    System.out.print("Введите размер массива: ");
                    size = Integer.parseInt(scanner.nextLine());
                    if (size <= 0) {
                        System.out.println("Размер массива должен быть положительным!");
                        continue;
                    }
                    array = new int[size];
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: Введите целое число!");
                }
            }

            // Ввод элементов массива
            for (int i = 0; i < size; i++) {
                while (true) {
                    try {
                        System.out.print("Введите элемент " + (i + 1) + ": ");
                        array[i] = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: Введите целое число!");
                    }
                }
            }

            // Вычисление среднего положительных элементов
            try {
                double average = calculateAverage(array);
                System.out.println("Среднее положительных элементов: " + average);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: В массиве нет положительных элементов!");
            }
        }

        public static double calculateAverage(int[] array) {
            int sum = 0;
            int count = 0;

            for (int num : array) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new ArithmeticException("Нет положительных элементов");
            }

            return (double) sum / count;
        }
}
