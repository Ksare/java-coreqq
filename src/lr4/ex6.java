package lr4;

import java.util.Random;

public class ex6 {
    public static void main(String[] args) {

    int rows = 5; // Количество строк
    int cols = 6; // Количество столбцов

    // Создаем и заполняем исходный массив случайными числами
    int[][] originalMatrix = new int[rows][cols];
    Random random = new Random();
        for(
    int i = 0;
    i<rows;i++)

    {
        for (int j = 0; j < cols; j++) {
            originalMatrix[i][j] = random.nextInt(100); // Числа от 0 до 99
        }
    }

    // Выводим исходный массив
        System.out.println("Исходный массив:");

    printMatrix(originalMatrix);

    // Генерируем случайные индексы для удаления
    int removeRow = random.nextInt(rows);
    int removeCol = random.nextInt(cols);
        System.out.println("\nУдаляем строку с индексом: "+removeRow +" и столбец с индексом: "+removeCol);

    // Создаем новый массив без указанной строки и столбца
    int[][] newMatrix = new int[rows - 1][cols - 1];
        for(
    int i = 0, newRow = 0;
    i<rows;i++)

    {
        if (i == removeRow) continue; // Пропускаем удаляемую строку
        for (int j = 0, newCol = 0; j < cols; j++) {
            if (j == removeCol) continue; // Пропускаем удаляемый столбец
            newMatrix[newRow][newCol] = originalMatrix[i][j];
            newCol++;
        }
        newRow++;
    }

    // Выводим новый массив
        System.out.println("\nНовый массив:");

    printMatrix(newMatrix);
}
    // Метод для вывода массива из задачи 5,6,7
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}