package packages.Threads;

public class Teste {
    public static void main(String[] args) {
        MinhaThread minhaThread = new MinhaThread("Thread #1", 3000);
        MinhaThread minhaThread2 = new MinhaThread("Thread #2", 50);
    }
}
