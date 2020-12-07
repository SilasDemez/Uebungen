package ue3;

public class Kugel implements Behaelter{

    double radius;


    public Kugel(double radius) {
        this.radius = radius;
    }

    @Override
    public double getOberflaeche() {
        return 4 * Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getVolumen() {
        return  Math.pow(radius, 3) * Math.PI * (4.0/3.0);
    }

    @Override
    public void veraendern(double inkrement) {
        radius += inkrement;
    }
}
