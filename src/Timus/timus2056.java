package Timus;

import java.util.Scanner;

public class timus2056 {
    public static void main(String[] args) {
            Scanner inputReader = new Scanner(System.in);

            System.out.print("Введите число предметов: ");

            int subjectCount = inputReader.nextInt(); // Количество предметов
            int[] marks = new int[subjectCount]; // Оценки по предметам

            boolean hasLowGrades = false; // Наличие удовлетворительных оценок
            boolean perfectScoresOnly = true; // Все ли отличные оценки
            int totalScore = 0; // Общая сумма баллов

            for (int idx = 0; idx < subjectCount; idx++) {
                marks[idx] = inputReader.nextInt();
                if (marks[idx] <= 3) {
                    hasLowGrades = true; // Обнаружена удовлетворительная оценка
                }
                if (marks[idx] < 5) {
                    perfectScoresOnly = false; // Есть оценки ниже отличных
                }
                totalScore += marks[idx]; // Накапливаем общую сумму
            }

            if (hasLowGrades) {
                System.out.println("None");
            } else if (perfectScoresOnly) {
                System.out.println("Named");
            } else {
                double averageMark = (double) totalScore / subjectCount;
                if (averageMark >= 4.5) {
                    System.out.println("High");
                } else {
                    System.out.println("Common");
                }
            }
        }
    }

