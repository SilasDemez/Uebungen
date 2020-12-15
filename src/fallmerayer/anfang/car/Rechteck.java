public class Rechteck {
    private double length,width,area,umfang,diagonals;

    public Rechteck(double length, double width){
        this.length = length;
        this.width = width;
        area = length * width;
        umfang = 2*length + 2*width;
        diagonals = Math.sqrt(length*length + width*width);
    }

    public Rechteck(){
        this(1,1);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
