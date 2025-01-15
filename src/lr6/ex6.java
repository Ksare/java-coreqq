package lr6;

import java.util.Arrays;

public class ex6 {
    public static class ClassEx6 {

        // Статический метод для получения нового массива
        public static int[] getSubArray(int[] sourceArray, int count) {
            if (sourceArray == null) {
                throw new IllegalArgumentException("Исходный массив не может быть null.");
            }

            // Если count больше длины массива, возвращаем копию исходного массива
            if (count >= sourceArray.length) {
                return Arrays.copyOf(sourceArray, sourceArray.length);
            }

            // В противном случае создаем массив из первых count элементов
            return Arrays.copyOfRange(sourceArray, 0, count);
        }

        // Основной метод для тестирования
        public static void main(String[] args) {
            int[] sourceArray = {1, 2, 3, 4, 5};

            // Пример с count меньше длины массива
            int[] subArray1 = getSubArray(sourceArray, 3);
            System.out.println("Новый массив (3 элемента): " + Arrays.toString(subArray1));

            // Пример с count больше длины массива
            int[] subArray2 = getSubArray(sourceArray, 10);
            System.out.println("Новый массив (вся копия): " + Arrays.toString(subArray2));

            // Пример с count равным длине массива
            int[] subArray3 = getSubArray(sourceArray, 5);
            System.out.println("Новый массив (вся копия): " + Arrays.toString(subArray3));
        }
    }
}



