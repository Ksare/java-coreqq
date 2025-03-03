package lr9;

import java.util.Scanner;

public class ex6 {
        private static String convertToBinary ( int number){
            // Получаем остаток от деления на 2 (0 или 1)
            char remainder = (char) ((number % 2) + '0');

            // Базовое условие остановки рекурсии
            if (number <= 1) {
                return String.valueOf(remainder);
            }

            // Рекурсивный вызов и сборка результата
            return convertToBinary(number >> 1) + remainder;
        }

        public static void main (String[]args){
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Введите целое число для конвертации в двоичный код: ");
                int inputNumber = scanner.nextInt();

                String binaryRepresentation = convertToBinary(inputNumber);

                System.out.println("Двоичное представление числа: " + binaryRepresentation);
            }
        }
    }

