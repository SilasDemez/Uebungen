package fallmerayer.interfaces.ue2;

public interface Robot {
    float x = 0;
    float y = 0;

    float[] getPos();

    void advance();

    void turnLeft();

    void turnRight();
}
