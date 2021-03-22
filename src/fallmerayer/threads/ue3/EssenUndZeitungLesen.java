package fallmerayer.threads.ue3;

import fallmerayer.threads.ue1.RunnableClass;

public class EssenUndZeitungLesen {

    public static void zeitungLesen(int repetitions) {
        for (int e = 0; e < repetitions; e++) {
            System.out.println(Thread.currentThread());
            System.out.println("Zeitung lesen" + e);
        }
    }

    public static void essen(int repetitions) {
        for (int e = 0; e < repetitions; e++) {
            System.out.println(Thread.currentThread());
            System.out.println("essen" + e);
        }
    }

    public static void main(String[] args) {
        int numberOfThreads = 10;

        for (int i = 0; i < numberOfThreads - 1; i++) {
            Runnable r1 = () -> essen(10);
            Thread t1 = new Thread(r1);
            t1.start();
        }

        for (int i = 0; i < numberOfThreads - 1; i++) {
            Runnable r2 = () -> zeitungLesen(10);
            Thread t2 = new Thread(r2);
            t2.start();
        }

    }
}
