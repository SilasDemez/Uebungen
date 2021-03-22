package fallmerayer.threads.ue1;

public class RunnableClass implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<50;i++){
            System.out.println(Thread.currentThread());
            System.out.println("essen");
        }
    }
}
