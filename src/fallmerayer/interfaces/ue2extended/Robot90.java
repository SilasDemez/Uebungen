package fallmerayer.interfaces.ue2extended;

public class Robot90 implements Robot{
    protected double x, y;
    protected int pos = 2;

    @Override
    public double[] getPos() {
        double[] xy = new double[2];
/* to indicate direction in wich the robot is pointing (2 = forward, 1 = left, 3 = right, 4 = down) */
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    @Override
    public void advance() {
        switch(pos){
            case 1:
                //left
                x--;
                break;
            case 2:
                //forward
                y++;
                break;
            case 3:
                //right
                x++;
                break;
            case 4:
                //down
                y--;
                break;
            default:
                System.out.println("There has been an error that shouldn't happen");
        }
    }

    @Override
    public void turnLeft() {
        pos--;
        if (pos == 0) //instead of 0 it points to down (4)
            pos = 4;
    }

    @Override
    public void turnRight() {
        pos++;
        if (pos == 5) //instead of 5 it points to left (1)
            pos = 1;
    }
}
