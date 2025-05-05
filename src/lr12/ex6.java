package lr12;

public class ex6 {
    public static long sumArray(int[] array) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors(); // число ядер
        System.out.println("Количесво ваших ядер: " + cores);

        int length = array.length;

        Thread[] threads = new Thread[cores];
        System.out.println("Количесво ваших потоков: " + cores);
        long[] partialSums = new long[cores]; // для хранения суммы каждого потока

        int chunkSize = (length + cores - 1) / cores; // делим массив

        for (int i = 0; i < cores; i++) {
            final int index = i;
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, length);

            // создаём поток для подсчёта суммы своей части массива
            threads[i] = new Thread(() -> {
                long sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                partialSums[index] = sum; // сохраняем сумму этого потока
            });
            threads[i].start(); // запускаем поток
        }

        // ждём завершения всех потоков
        for (Thread t : threads) {
            t.join();
        }

        // суммируем результаты всех потоков
        long totalSum = 0;
        for (long partSum : partialSums) {
            totalSum += partSum;
        }
        return totalSum;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        long sum = sumArray(array);
        System.out.println("Сумма элементов: " + sum);
    }
}

