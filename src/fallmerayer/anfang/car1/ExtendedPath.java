public class ExtendedPath extends BasicPath{

    public double length(){
    double distance=0.0;
        for(int i=0; i<points.size()-1; i++){
            int x = points.get(i).getX() - points.get(i+1).getX();
            int y = points.get(i).getY() - points.get(i+1).getY();
            distance += Math.sqrt(x*x + y*y);
        }
        return distance;
    }

    public static void main(String[] args) {
        Point punkt1 = new Point(3,3);
        Point punkt2 = new Point(2,3);
        ExtendedPath path = new ExtendedPath();
        path.addPoint(punkt1);
        path.addPoint(punkt2);
        System.out.println(path.length());
    }
}
