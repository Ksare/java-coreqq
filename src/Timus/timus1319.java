package Timus;

import java.util.Scanner;

public class timus1319 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixSize = input.nextInt();
        input.close();

        int[][] diagonalMatrix = new int[matrixSize][matrixSize];
        int currentNumber = 1;

        // Заполнение верхних диагоналей (от главной диагонали вверх)
        for (int initialCol = matrixSize - 1; initialCol >= 0; initialCol--) {
            int row = 0, col = initialCol;
            while (col < matrixSize) {
                diagonalMatrix[row][col] = currentNumber++;
                row++;
                col++;
            }
        }

        // Заполнение нижних диагоналей (ниже главной диагонали)
        for (int initialRow = 1; initialRow < matrixSize; initialRow++) {
            int row = initialRow, col = 0;
            while (row < matrixSize) {
                diagonalMatrix[row][col] = currentNumber++;
                row++;
                col++;
            }
        }

        // Вывод заполненной матрицы
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(diagonalMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

