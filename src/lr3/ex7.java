package lr3;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 10;

        System.out.println("Размер массива: " + size);


        char[] array = new char[size];

        char currentChar = 'a';
        for (int i = 0; i < size; i++) {
            array[i] = currentChar;
            currentChar += 2;
        }
        System.out.println("Массив в прямом порядке:");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Массив в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
