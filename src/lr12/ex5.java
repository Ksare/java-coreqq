package lr12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ex5 {

    // Метод для поиска максимума с помощью потоков
    public static int findMax(int[] array) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors(); // число ядер
        System.out.println("Количесво ваших ядер: " + cores);
        int length = array.length; // длина массива

        // Массив для хранения потоков
        Thread[] threads = new Thread[cores];
        System.out.println("Количесво ваших потоков: " + cores);

        // Массив для хранения результатов каждого потока
        int[] maxValues = new int[cores];

        // Размер части массива для каждого потока
        int chunkSize = (length + cores - 1) / cores;

        for (int i = 0; i < cores; i++) {
            final int index = i; // для использования внутри анонимного потока
            // Начальные и конечные индексы части массива
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, length);

            // Создаём поток
            threads[i] = new Thread(() -> {
                int max = Integer.MIN_VALUE;
                // ищем максимум в части массива
                for (int j = start; j < end; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }
                maxValues[index] = max; // сохраняем результат
            });

            threads[i].start(); // запускаем поток
        }

        // Ждём завершения всех потоков
        for (Thread t : threads) {
            t.join();
        }

        // Находим максимум среди результатов потоков
        int globalMax = Integer.MIN_VALUE;
        for (int val : maxValues) {
            if (val > globalMax) {
                globalMax = val;
            }
        }

        return globalMax;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {3, 5, 7, 2, 8, 1, 9, 4, 6}; // пример массива
        int max = findMax(array);
        System.out.println("Максимальный элемент: " + max);
    }
}
