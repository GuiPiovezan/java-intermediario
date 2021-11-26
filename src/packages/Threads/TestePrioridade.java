package packages.Threads;

public class TestePrioridade {
    public static void main(String[] args) {
        MinhaThreadRunnable minhaThreadRunnable1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable minhaThreadRunnable2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable minhaThreadRunnable3 = new MinhaThreadRunnable("#3", 500);

        Thread thread1 = new Thread(minhaThreadRunnable1);
        Thread thread2 = new Thread(minhaThreadRunnable2);
        Thread thread3 = new Thread(minhaThreadRunnable3);

        thread1.setPriority(5);
        thread2.setPriority(3);
        thread3.setPriority(1);

        // thread1.setPriority(Thread.MAX_PRIORITY);
        // thread2.setPriority(Thread.NORM_PRIORITY);
        // thread3.setPriority(Thread.MIN_PRIORITY);


        thread1.start();
        thread2.start();
        thread3.start();
    }
}
