package lr12;

public class ex4v1 {
    public static void main(String[] args) throws InterruptedException {
        //Простой способ без массивов
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": №1");

        }


        );
        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": №2");

        }
        );

        Thread t3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": №3");

        }
        );

        Thread t4 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": №4");

        }
        );

        Thread t5 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": №5");

        }
        );

        Thread t6 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": №6");

        }
        );

        Thread t7 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": №7");

        }
        );

        Thread t8 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": №8");

        }
        );

        Thread t9 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": №9");

        }
        );

        Thread t10 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": №10");

        }
        );



        t1.setName("Поток");
        t2.setName("Поток");
        t3.setName("Поток");
        t4.setName("Поток");
        t5.setName("Поток");
        t6.setName("Поток");
        t7.setName("Поток");
        t8.setName("Поток");
        t9.setName("Поток");
        t10.setName("Поток");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();
        t6.start();
        t6.join();
        t7.start();
        t7.join();
        t8.start();
        t8.join();
        t9.start();
        t9.join();
        t10.start();
        t10.join();

    }
}


