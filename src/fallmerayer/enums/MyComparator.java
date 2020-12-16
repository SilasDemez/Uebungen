package fallmerayer.enums;

import java.util.ArrayList;
import java.util.Collections;

public class MyComparator {

    public static void main(String[] args) {
        ArrayList<Integer> zahlenfolge = new ArrayList<>();

        for(int i =0;i<10;i++){
            zahlenfolge.add((int) (Math.random()*(10-1)+1));
        }

        System.out.println("Unsortiert: ");
        for(int zahl : zahlenfolge) System.out.print(zahl+ " ");

        zahlenfolge.sort(new NumberComparator());

        System.out.println("\nSortiert:");
        for(int zahl : zahlenfolge) System.out.print(zahl+ " ");
    }
}
