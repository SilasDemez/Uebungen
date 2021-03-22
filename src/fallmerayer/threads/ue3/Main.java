package fallmerayer.threads.ue3;

public class Main {
    public static void wink(int repetitions){
        for ( int i = 0; i < repetitions; i++ )
            System.out.printf( "Wink; %s%n", Thread.currentThread() );
    }

    public static void wave(int repetitions){
        for ( int i = 0; i < 50; i++ )
            System.out.printf( "Wave flag; %s%n", Thread.currentThread() );
    }



    public static void main(String[] args) {
        // Runnable 1
        Runnable winker = () -> wink(20);
        // Runnable 2
        Runnable flagWaver = () -> wave(20);

        winker.run();
        flagWaver.run();
    }
}
