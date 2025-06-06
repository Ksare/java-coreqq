package lr13;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] array = null;
        int size = 0;

        // Ввод размера массива
        while (true) {
            try {
                System.out.print("Введите размер массива (1-100): ");
                size = Integer.parseInt(scanner.nextLine());
                if (size <= 0 || size > 100) {
                    System.out.println("Размер должен быть от 1 до 100");
                    continue;
                }
                array = new byte[size];
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите целое число!");
            }
        }

        // Ввод элементов массива
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.printf("Введите элемент %d (от -128 до 127): ", i + 1);
                    int value = Integer.parseInt(scanner.nextLine());
                    if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
                        System.out.println("Число должно быть в диапазоне от -128 до 127");
                        continue;
                    }
                    array[i] = (byte) value;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: Введите целое число!");
                }
            }
        }

        // Вычисление суммы с проверкой переполнения
        try {
            byte sum = calculateByteSum(array);
            System.out.println("Сумма элементов: " + sum);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Переполнение при вычислении суммы!");
        }
    }

    public static byte calculateByteSum(byte[] array) {
        int sum = 0; // Используем int для промежуточных вычислений

        for (byte num : array) {
            sum += num;
            // Проверка на переполнение byte
            if (sum > Byte.MAX_VALUE || sum < Byte.MIN_VALUE) {
                throw new ArithmeticException("Переполнение типа byte");
            }
        }

        return (byte) sum;
    }
}


