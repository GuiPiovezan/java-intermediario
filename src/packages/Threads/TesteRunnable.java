package packages.Threads;

public class TesteRunnable {
    public static void main(String[] args) {
        MinhaThreadRunnable minhaThread = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable minhaThread2 = new MinhaThreadRunnable("#2", 600);
        MinhaThreadRunnable minhaThread3 = new MinhaThreadRunnable("#3", 700);
        // Thread thread = new Thread(minhaThread);

        
    }
}
