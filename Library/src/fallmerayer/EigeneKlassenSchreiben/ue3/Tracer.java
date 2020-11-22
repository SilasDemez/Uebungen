package it.fallmerayer.EigeneKlassenSchreiben.ue3;

public class Tracer {

    private static boolean state = false;

    static void trace(String str){
        if(state == true) System.out.println(str);
    }

    static void trace(String format, Object... args){
        if(state == true) System.out.printf(format, args);
    }

    static void on(){
        state = true;
    }

    static void off(){
        state = false;
    }

    public static void main(String[] args) {
        on();
        trace("Zahl1:%d Zaahl2:%d Zahl3:%d", 10, 5, 6);
    }
}
