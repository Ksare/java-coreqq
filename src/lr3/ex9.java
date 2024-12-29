package lr3;

import java.util.Random;

public class ex9 {
    public static void main(String[] args) {
        int size = 10;

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int min = array[0];
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }


        System.out.println("Минимальное значение: " + min);
        System.out.println("Индексы минимального значения: " + indexMin);
    }

}
