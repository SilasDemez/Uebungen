package Strings;
import java.util.Scanner;

public class HTML1 {

    public static String htmlElement(String tag, String eingabe) {
        if (tag.contains("b")) eingabe = bold(eingabe);
        else if (!tag.contains("i")) {
            eingabe = "<" + tag + ">" + eingabe + "</" + tag + ">";
        } else eingabe = italic(eingabe);
        return eingabe;
    }

    public static String bold(String eingabe){
        eingabe = "<b>" + eingabe + "</b>";
        return eingabe;
    }

    public static String italic(String eingabe){
        eingabe = "<i>" + eingabe + "</i>";
        return eingabe;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Gib den Tag ein: ");
        String tag = scanner.nextLine();  // Read user input
        System.out.println("Gib den Text ein: ");
        String eingabe = scanner.nextLine();  // Read user input

        System.out.println(htmlElement(tag,eingabe));
    }
}
