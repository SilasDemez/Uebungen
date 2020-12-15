package fallmerayer.exceptions.ue1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        String str;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("input.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            e.printStackTrace();
        }
        for(int i=0; i<5;i++) {
            try {
                str = br.readLine();
                System.out.println(str);
            } catch (IOException e) {
                System.out.println("IOException when reading file");
                e.printStackTrace();
            }
        }

        try {
            br.close();
        } catch (IOException e) {
            System.out.println("IOException when closing");
            e.printStackTrace();
        }
    }
}
