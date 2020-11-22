package fallmerayer.interfaces.ue2extended;

import static java.lang.Math.sqrt;

public class Robot45 implements Robot{
    protected double x,y;
    protected int pos = 3;

    @Override
    public double[] getPos() {
        double[] xy = new double[2];
        /* to indicate direction in wich the robot is pointing
        1 = 0°  (left)
        2 = 45°
        3 = 90° (forward)
        4 = 135°
        5 = 180° (right)
        6 = 225°
        7 = 270° (down)
        8 = 315°
        */
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    @Override
    public void advance() {
        switch(pos){
            case 1:
                //1 = 0°  (left)
                x--;
                break;
            case 2:
                //2 = 45°
                x-= sqrt(2)/2;
                y+= sqrt(2)/2;
                break;
            case 3:
                //3 = 90° (forward)
                y++;
                break;
            case 4:
                //4 = 135°
                x+= sqrt(2)/2;
                y+= sqrt(2)/2;
                break;
            case 5:
                //5 = 180° (right)
                x++;
                break;
            case 6:
                //6 = 225°
                x+= sqrt(2)/2;
                y-= sqrt(2)/2;
                break;
            case 7:
                //7 = 270° (down)
                y--;
                break;
            case 8:
                //8 = 315°
                x-= sqrt(2)/2;
                y-= sqrt(2)/2;
                break;
            default:
                System.out.println("There has been an error that should't happen");
        }
    }

    @Override
    public void turnLeft() {
        pos--;
        if (pos == 0) //instead of 0 it points to 8 = 315°
        pos = 8;
    }

    @Override
    public void turnRight() {
        pos++;
        if (pos == 9) //instead of 9 it points to 1 = 0°  (left)
        pos = 0;
    }
}

