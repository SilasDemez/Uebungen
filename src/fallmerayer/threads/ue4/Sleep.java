package fallmerayer.threads.ue4;

public class Sleep {

    public static void main(String[] args) throws InterruptedException {
        long timeToSleep = 0;       // in seconds
        String temp;

        for (String str:args) {
            if (str.contains("m")){
                //Minutes
                temp = str.substring(0,str.indexOf("m"));
                timeToSleep += Integer.parseInt(temp) * 60;
            }else if (str.contains("h")){
                //Hours
                temp = str.substring(0,str.indexOf("h"));
                timeToSleep += Integer.parseInt(temp) * 60 * 60;
            }else if (str.contains("d")){
                //Minutes
                temp = str.substring(0,str.indexOf("d"));
                timeToSleep += Integer.parseInt(temp) * 60 * 60 * 24;
            }else{
                //Minutes
                try {
                    temp = str.substring(0,str.indexOf("s"));
                }catch (Exception e){
                    temp = str;
                }
                timeToSleep += Integer.parseInt(temp);

            }
        }

        Thread.sleep(timeToSleep * 1000);
    }
}
