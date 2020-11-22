package fallmerayer.interfaces;

public class Fahrplan {

    Fahrplan(){}

    public int getPreis(Ort[] route) {
    int distance = 0;
        for(int i=1;i< route.length;i++){
            distance += route[i-1].getDistTo(route[i]);
        }
        return distance*2;
    }
}
