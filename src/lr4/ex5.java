package lr4;

public class ex5 {
    public static void main(String[] args) {
        int rows = 3; // Количество строк
        int cols = 5; // Количество столбцов

        // Создаем и заполняем исходный массив случайными числами
        int[][] originalMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalMatrix[i][j] = (int) (Math.random() * 100); // Числа от 0 до 99
            }
        }

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        printMatrix(originalMatrix);

        // Транспонируем массив
        int[][] changedMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                changedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        // Выводим транспонированный массив
        System.out.println("\nИзменённый массив:");
        printMatrix(changedMatrix);
        for (int[] row : originalMatrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}