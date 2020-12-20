package fallmerayer.enums;

/**
 * Interface to calculate the distance of 2-and 3-dimensional points
 */
public interface Distance {
    double distance( double x1, double y1, double x2, double y2);
    double distance( double x1, double y1,double z1, double x2, double y2, double z2);
}
