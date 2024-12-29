package lr3;

import java.util.Arrays;
import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        int size = 10;

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Случайные числа от 0 до 99
        }

        System.out.println("Массив до сортировки:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Arrays.sort(array);
        int[] descendingArray = new int[size];
        for (int i = 0; i < size; i++) {
            descendingArray[i] = array[size - 1 - i];
        }

        System.out.println("Массив после сортировки по убыванию:");
        for (int num : descendingArray) {
            System.out.print(num + " ");
        }
    }
}
