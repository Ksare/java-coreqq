package lr6;

public class ex3 {
    public static class ClassEx3{
        // Статический метод для нахождения максимального значения
        public static int findMax(int... numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("Массив чисел не должен быть пустым.");
            }
            int max = numbers[0];
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
        // Статический метод для нахождения минимального значения
        public static int findMin(int... numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("Массив чисел не должен быть пустым.");
            }
            int min = numbers[0];
            for (int num : numbers) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }

        // Статический метод для нахождения среднего значения
        public static double findAverage(int... numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("Массив чисел не должен быть пустым.");
            }
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return (double) sum / numbers.length;
        }

        // Основной метод для тестирования
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};

            // Вывод максимального значения
            System.out.println("Максимальное значение: " + ClassEx3.findMax(numbers));

            // Вывод минимального значения
            System.out.println("Минимальное значение: " + ClassEx3.findMin(numbers));

            // Вывод среднего значения
            System.out.println("Среднее значение: " + ClassEx3.findAverage(numbers));
        }
    }
    }

