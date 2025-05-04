package lr12;

public class ex3v1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++)
                if (i % 2 == 0)
                    System.out.println(Thread.currentThread().getName() + ": " + i);


        }
        );
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++)
                if (i % 2 != 0)
                    System.out.println(Thread.currentThread().getName() + ": " + i);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }

}
