package fallmerayer.threads.ue2;

import javax.swing.*;

public class Main {
    static public void endProcess(Thread t1, Thread t2){
        String str = JOptionPane.showInputDialog("Gib zum beenden 'endeat' oder 'endread' ein:\n");
        System.out.println(str);

        switch (str){
            case "endeat":
                t1.interrupt();
                if (t2.isAlive()) {
                    System.out.println("Jetzt arbeitet nur mehr der Prozess t2");
                    endProcess(t1, t2);
                }
                break;
            case "endread":
                t2.interrupt();
                if (t1.isAlive()) {
                    System.out.println("Jetzt arbeitet nur mehr der Prozess t1");
                    endProcess(t1, t2);
                }
                break;
            default:
                System.out.println("Du willst kein Prozess beenden?");
                endProcess(t1,t2);
                break;
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("essen");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Thread 1 wird beendet");
                    }
                }


            }
        });


        Thread t2 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("Zeitung lesen");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread 2 wird beendet");
                }
            }
        });


        t1.start();
        t2.start();


        endProcess(t1,t2);

    }
}
