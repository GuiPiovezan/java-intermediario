package packages.Threads;

public class MinhaThreadRunnable implements Runnable {

    private String nome;
        private int tempo;

    public MinhaThreadRunnable(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i <= 5; i++){
                System.out.println(this. nome + " " +i);
                    Thread.sleep(this.tempo);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(this.nome + " Terminou o processo");
        
    }
    
}
