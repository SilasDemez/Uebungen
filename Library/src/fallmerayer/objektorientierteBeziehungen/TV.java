package it.fallmerayer.objektorientierteBeziehungen;

public class TV {

    private MonitorTube monitorTube;

    public void on(){
        System.out.println("On");
        monitorTube.on();
    }

    public void off(){
        System.out.println("Off");
        monitorTube.off();
    }
}
