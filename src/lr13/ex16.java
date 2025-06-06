package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        // Пример матрицы 3x3
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Scanner scanner = new Scanner(System.in);
        int columnNumber = 0;
        boolean validInput = false;

        // Ввод номера столбца с обработкой ошибок
        while (!validInput) {
            try {
                System.out.print("Введите номер столбца (от 0 до " + (matrix[0].length - 1) + "): ");
                columnNumber = scanner.nextInt();

                // Проверка существования столбца
                if (columnNumber < 0 || columnNumber >= matrix[0].length) {
                    throw new ArrayIndexOutOfBoundsException();
                }

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введите целое число!");
                scanner.nextLine(); // Очистка буфера ввода
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: Столбец с номером " + columnNumber + " не существует!");
            }
        }

        // Вывод выбранного столбца
        System.out.println("Столбец " + columnNumber + ":");
        for (int[] row : matrix) {
            System.out.println(row[columnNumber]);
        }
    }
}

