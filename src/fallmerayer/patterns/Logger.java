package fallmerayer.patterns;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    public static Logger INSTANCE;

    public static Logger getInstance(){
        if (INSTANCE == null)
            return new Logger();
        return INSTANCE;
    }

    private Logger(){

    }

    public void TimeConsoleLog(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); // To format the time got in LocalDateTime.now()
        LocalDateTime now = LocalDateTime.now();        // Unformatted:  2021-02-09T17:14:37.506600600
        System.out.println("Time: " + dtf.format(now)); // Formatted:    2021/02/09 17:14:37
    }

    public void TimeConsoleLogToFile(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); // To format the time got in LocalDateTime.now()
        LocalDateTime now = LocalDateTime.now();    // Unformatted:  2021-02-09T17:14:37.506600600
        try {
            FileWriter myWriter = new FileWriter("date.txt");
            myWriter.write(dtf.format(now));        // Formatted: 2021/02/09 17:14:37
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
