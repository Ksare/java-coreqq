package Timus;

import java.util.Scanner;

public class timus1313 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] grid = new int[size][size];

        // Заполнение матрицы
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                grid[row][col] = input.nextInt();
            }
        }

        // Обход матрицы по диагоналям
        for (int diag = 0; diag <= 2 * (size - 1); diag++) {
            for (int rowIdx = Math.min(diag, size - 1); rowIdx >= 0; rowIdx--) {
                int colIdx = diag - rowIdx;
                if (colIdx >= 0 && colIdx < size) {
                    System.out.print(grid[rowIdx][colIdx] + " ");
                }
            }
        }
    }
}

