package Strings;
import javax.swing.JOptionPane;
//toUpperCase

public class PrintUnderline {
    public static String PrintUnderLine(String string, String search){
        String str = "";
        int pos=0;

        while(string == string) {
            pos = -1;
            pos = string.indexOf(search);

            if (pos == -1) break;

            for (int i = 0; i < pos; i++) {
                str = str + " ";
            }

            for (int i = 0; i < search.length(); i++) {
                str = str + "-";
            }

            StringBuilder str1 = new StringBuilder(string);
            str1.delete(0,(pos + search.length()));
            string = str1.toString();

        }

        return str;
    }

    public static void main(String[] args) {
        String string = JOptionPane.showInputDialog("Bitte gib einen String ein: ");
        String search = JOptionPane.showInputDialog("Bitte gib das zu unterstreichende Wort ein: ");


        String str = PrintUnderLine(string,search);
        System.out.println(string);
        System.out.println(str);

    }

}
