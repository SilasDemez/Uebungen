package it.fallmerayer.objektorientierteBeziehungen;

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

        static double stationNameToFrequency(String station){
            double frequency=0;

            if (station == "A") frequency = 1.0;
            else if (station == "B") frequency = 2.0;
            else if (station == "C") frequency = 3.0;
            else if (station == "D") frequency = 4.0;
            else if (station == "E") frequency = 5.0;
            else if (station == "F") frequency = 6.0;

            return frequency;
        }


}
