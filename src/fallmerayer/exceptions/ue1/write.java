package fallmerayer.exceptions.ue1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) throws MyException, IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write("eine neue ausgabe in txt");
        // Wenn Datei noch nicht vorhanden -->
        // Datei wird erstellt
        bw.close();
    }
}

class MyException extends Exception{

}
