package Strings;
//import javax.swing.JOptionPane;
import java.util.Scanner;
public class strings_füllen2 {
    public static String mix(String eingabe, char zeichen){
        StringBuilder str = new StringBuilder(eingabe);
        for(int i=1; i<str.length();i+=2){
            str.insert(i,zeichen);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gib einen String ein: ");
        String eingabe = sc.nextLine();
        System.out.println("Bitte gib einen Char ein: ");
        char zeichen = sc.next().charAt(0);
        eingabe = mix(eingabe,zeichen);
        System.out.println(eingabe);
    }
}
