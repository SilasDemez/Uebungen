import java.util.ArrayList;

public class BasicPath {
    protected ArrayList <Point> points;

    public BasicPath() {
        points = new ArrayList <Point>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }
}
