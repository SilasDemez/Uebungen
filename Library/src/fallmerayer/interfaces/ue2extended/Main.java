package fallmerayer.interfaces.ue2extended;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Robot90 robot90 = new Robot90();
        Robot45 robot45 = new Robot45();
        remoteControl.control(robot90);
        remoteControl.control(robot45);
    }
}
