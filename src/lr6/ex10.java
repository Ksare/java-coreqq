package lr6;

public class ex10 {
    // Статический метод для нахождения минимального и максимального значений
    public static int[] findMinMax(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Должно быть передано хотя бы одно число.");
        }

        int min = numbers[0];
        int max = numbers[0];

        // Поиск минимального и максимального значений
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Возвращаем массив из минимального и максимального значений
        return new int[]{min, max};
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        // Пример с произвольным количеством аргументов
        int[] result = findMinMax(10, 20, 5, 30, 15);

        System.out.println("Минимальное значение: " + result[0]);
        System.out.println("Максимальное значение: " + result[1]);
    }
}


