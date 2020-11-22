package fallmerayer.interfaces.ue2extended;

public interface Robot {
    int x = 0;
    int y = 0;

    int[] getPos();

    void advance();

    void turnLeft();

    void turnRight();
}
