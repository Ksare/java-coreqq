package lr6;

public class ex8 {

    // Статический метод для вычисления среднего значения массива
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть null или пустым.");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // Вычисляем среднее значение массива
        double average = calculateAverage(array);

        // Вывод результата
        System.out.println("Массив: " + java.util.Arrays.toString(array));
        System.out.println("Среднее значение элементов массива: " + average);
    }
}

