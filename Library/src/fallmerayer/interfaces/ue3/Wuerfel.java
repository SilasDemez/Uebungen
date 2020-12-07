package ue3;

public class Wuerfel implements Behaelter {

    double laenge;

    public Wuerfel(double laenge) {
        this.laenge = laenge;
    }

    @Override
    public double getOberflaeche() {
        return laenge * laenge * 6;
    }

    @Override
    public double getVolumen() {
        return Math.pow(laenge, 3);
    }

    @Override
    public void veraendern(double inkrement) {
        laenge += inkrement;
    }

}
