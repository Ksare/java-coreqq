package lr12;

public class ex4v2 {
    public static void main(String[] args) throws InterruptedException{
        //Второй способ через массивы
        Thread [] threads = new Thread[10];

        for (int i = 0; i <= 10; i++) {
            threads[i] = new Thread(()-> {
                System.out.println("Поток " + Thread.currentThread().getName());
            });
            threads[i].start();
        }

        for (int i = 0; i <= 10; i++) {
            threads[i].join();
        }



    }
}
