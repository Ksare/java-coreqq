package lr9;

import java.util.Scanner;

public class ex7 {
    private static final String INPUT_PROMPT = "Введите элемент массива [%d]: ";
    private static final String OUTPUT_FORMAT = "%d ";

    public static void fillArray(int[] arr, int position) {
        if (position < 0) {
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.printf(INPUT_PROMPT, position);
        arr[position] = scanner.nextInt();

        fillArray(arr, position - 1);
    }

    public static void displayArray(int[] arr, int position) {
        if (position < 0) {
            return;
        }

        displayArray(arr, position - 1);
        System.out.printf(OUTPUT_FORMAT, arr[position]);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Неверный размер массива!");
                return;
            }

            int[] array = new int[size];

            System.out.println("\nЗаполнение массива:");
            fillArray(array, size - 1);

            System.out.println("\nВывод массива:");
            displayArray(array, size - 1);
        }
    }
}

