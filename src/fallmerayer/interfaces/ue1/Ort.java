import java.util.Arrays;
import java.util.Random;

public class Ort {
    private static Random rand = new Random();
    private static final double MAX_COORD = 100000;
    private static final int NUM_COORD = 2;
    private static final double DOWNHILL = 0.5;
    private String name;
    private double[] coord = new double[NUM_COORD];

    Ort(String name) {
        this.name = name;
        for(int i=0;i<coord.length;i++)
            coord[i] = MAX_COORD*rand.nextDouble();
    }
    public String toString() {
        return "Ort:" + name + Arrays.toString(coord);
    }

    double getDistTo(Ort ort) {
        double dist = 0;
        for(int i=0; i<coord.length; i++) {
            double distCoord = ort.coord[i] - coord[i];
            if(distCoord > 0)
                dist = dist + distCoord;
            else
                dist = dist - distCoord * DOWNHILL;
    } return dist;
    }

}
