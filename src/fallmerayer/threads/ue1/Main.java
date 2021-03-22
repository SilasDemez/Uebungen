package fallmerayer.threads.ue1;

public class Main {

    public static void main(String[] args) {
        final int numberOfThreads = 1000000;
        Thread t1 = new Thread(new RunnableClass());

        for (int i=0; i<numberOfThreads-1;i++) {
            Thread t3 = new Thread(() -> {
                for (int e = 0; e < 50; e++) {
                    System.out.println(Thread.currentThread());
                    System.out.println("essen" + e);
                }
            });
            t3.start();
        }

    }
}
