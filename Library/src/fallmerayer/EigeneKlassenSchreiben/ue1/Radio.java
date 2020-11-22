package it.fallmerayer.EigeneKlassenSchreiben.ue1;

public class Radio {
    private boolean isOn = false;
    private int volume=0;
    private double frequency;
    public int getVolume() {
        return volume;
    }

    public void volumeUp(){
        if (volume<100)
            volume++;
    }

    public void volumeDown(){
        if (volume>0)
            volume--;
    }

    public void on(){
        isOn = true;
        System.out.println("On");
    }

    public void off(){
        isOn = false;
        System.out.println("Off");
    }

    public boolean isOn(){
        return isOn;
    }

    public String toString(){
        return "Radio[State: " + isOn + "Frequency: " + frequency + "volume = " + volume;
    }
}
