package fallmerayer.patterns.mvc;

public class Model {

    public double fahrToCels(double t){
        return (5.0 *(t-32.0)/9.0);
    }

    public double celsToFahr(double t){
        return (9.0 * t/5.0 + 32.0);
    }
}
