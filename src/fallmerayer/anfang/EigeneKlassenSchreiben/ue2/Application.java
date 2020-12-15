package it.fallmerayer.EigeneKlassenSchreiben.ue2;

public class Application {
    public static void main(String[] args) {
        Radio grandmasOldRadio = new Radio();
/*
        System.out.println(grandmasOldRadio.isOn());        //false
        grandmasOldRadio.on();                              //On
        System.out.println(grandmasOldRadio.isOn());        //true
        System.out.println(grandmasOldRadio.getVolume());   //0
        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeDown();
        grandmasOldRadio.volumeUp();
        System.out.println(grandmasOldRadio.getVolume());   //2
        System.out.println(grandmasOldRadio.toString());    //it.fallmerayer.EigeneKlassenSchreiben.ue1.Radio@5f184fc6
        System.out.println(grandmasOldRadio);               //it.fallmerayer.EigeneKlassenSchreiben.ue1.Radio@5f184fc6
        grandmasOldRadio.off();                             //Off
  */
        System.out.println(Radio.stationNameToFrequency("null"));
    }
}
