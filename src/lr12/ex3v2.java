package lr12;

public class ex3v2 {

    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {
        Thread EvenNumber = new Thread(() -> {
            synchronized (lock) {
                while (number <= 10) {
                    if (number % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread OddNumber = new Thread(() -> {
            synchronized (lock) {
                while (number <= 10) {
                    if (number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        EvenNumber.setName("EvenNumber");
        OddNumber.setName("OddNumber ");

        EvenNumber.start();
        OddNumber.start();

    }
}