package fallmerayer.enums;

/**
 * <h1>Application</h1>
 *
 * Contains the {@code main(} class for the enum exercises
 *
 * @author Silas Demez
 * @version 1.0
 * @since 2020-12-16
 */

import java.util.Scanner;

//import static fallmerayer.enums.CandyType.CHOCOLATE;

public class Application {

    /**
     * The main method first creates a scanner {@code sc}. It executes commands for <b>Übung 1</b> and <b>Übung 2</b>
     * @param args
     */
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);


        // Übung 1
        System.out.println("Gib eine Süßigkeit ein: ");
        str = sc.nextLine();
        System.out.println("Dazu passendes Enum-Objekt: " + CandyType.fromName(str));

        // Übung 2
        System.out.println("Suche eine zufällige Süßigkeit aus....");
        System.out.println("Die zufällig ausgesuchte Süßigkeit ist: " + CandyType.random());

        // Übung 3
        System.out.print("Der Süchtigkeitsfaktor von Schokolade: ");
        System.out.println(CandyType.CHOCOLATE.addictiveQuality());
        System.out.println(CandyType.GUMMIES.next());
    }

}
