package fallmerayer.enums;

import java.util.Scanner;

/**
 * Application
 *
 * Contains the {@code main()} class for the enum exercises
 * Its scope is to execute the commands for testing the various exercises
 *
 * @author Silas Demez
 * @version 1.1
 * @since 2020-12-16
 */
public class Application {

    /**
     *  {@code main()} executes commands for exercises
     *  It executes commands for <b>Übung 1</b>, <b>Übung 2</b>, <b>Übung 3</b> and <b>Übung 4</b>
     *  Uses the java scanner class @see java.util.Scanner
     * @param args Parameter of main method
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

        // Übung 4
        System.out.print("EUCLIDEAN 2D: ");
        System.out.println(Distances.EUCLIDEAN.distance(1,1,2,2));  // EUCLIDEAN 2D: 1.4142135623730951
        System.out.print("EUCLIDEAN 3D: ");
        System.out.println(Distances.EUCLIDEAN.distance(1,1,1,2,2,2));  // EUCLIDEAN 3D: 1.0

        System.out.print("MANHATTAN 2D: ");
        System.out.println(Distances.MANHATTAN.distance(1,1,2,2));  //MANHATTAN 2D: 2.0
        System.out.print("MANHATTAN 3D: ");
        System.out.println(Distances.MANHATTAN.distance(1,1,1,2,2,2));  //MANHATTAN 3D: 3.0
    }
}
