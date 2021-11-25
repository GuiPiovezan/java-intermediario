package packages.Threads;

public class MinhaThread extends Thread{
    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        this.start();
    }

    @Override
    public void run(){
        System.out.println("Executando a Thread");

        try {
            for(int i = 0; i <= 5; i++){
                System.out.println(i);
                    this.sleep(this.tempo);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Terminou o processo");
    }
}
