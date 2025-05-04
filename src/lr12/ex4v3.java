package lr12;

public class ex4v3 {
    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            int threadNumber = i + 1;
            threads[i] = new Thread(() -> {
                System.out.println("Поток № " + threadNumber );
                try {
                    Thread.sleep(10); // задержка для наглядности
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            threads[i].start();
            threads[i].join();
        }

        // Запускаем потоки по порядку и ждём завершения каждого


        System.out.println("Все потоки завершены");
    }
}
