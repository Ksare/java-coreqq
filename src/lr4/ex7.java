package lr4;

public class ex7 {
    public static void main(String[] args) {
        int rows = 5; // Количество строк
        int cols = 5; // Количество столбцов

        int[][] matrix = new int[rows][cols];
        int value = 1; // Начальное значение для заполнения

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Заполнение строки слева направо
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = value++;
                }
            } else {
                // Заполнение строки справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    matrix[i][j] = value++;
                }
            }
        }

        // Вывод массива
        printMatrix(matrix);
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
