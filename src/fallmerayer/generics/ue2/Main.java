package fallmerayer.generics.ue2;

public class Main {

    public static void main(String[] args) {
        // Create 2 bottles
        Flasche<Wein> f1 = new Flasche<>();
        Flasche<Bier> f2 = new Flasche<>();

        // Create wine
        Rotwein lagrein = new Rotwein("Kurtatsch");
        // Crete beer
        Bier kronen = new Bier("Forst");

        // fill bottle1 with previously created wine
        f1.fuellen(lagrein);
        // fill bottle2 with previously created beer
        f2.fuellen(kronen);

        // Print content of bottle1
        System.out.println("Inhalt Flasche 1: " + f1.inhalt);
        // Check if bottle2 is empty
        System.out.println("\nIst die Flasche 2 leer?\n" + f2.istLeer());
        // Empty bottle1 and print the return of function leeren()
        System.out.println("\nLeere Flasche 1...\nInhalt Flasche 1: " + f1.leeren());
    }
}
