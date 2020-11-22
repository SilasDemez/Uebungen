public class Car{
    String name;
    int zulassungsjahr;
    double hoechstgeschwindigkeit;
    String farbe;

    public void gibFarbeAus(){
        System.out.println("Das Auto hat die Farbe:" + farbe);
    }

    public void gibAlterAus(){
        System.out.println("Das Auto ist " + (2020-zulassungsjahr) + " Jahre alt");
    }

    public void fahre(){
        System.out.println("Das Auto fährt 88 km/h schenll");
    }

    public Car(String name, int zulassungsjahr, double hoechstgeschwindigkeit, String farbe) {
        this.name = name;
        this.zulassungsjahr = zulassungsjahr;
        this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
        this.farbe = farbe;
    }

    public static void main(String[] args) {
        Car a = new Car("Model_S", 2012, 145.2, "rot");
        Car b= new Car("taycan",2019,201.3,"grau");
        Car c= new Car("Model_Y",2020,182.7,"weiß");


        a.gibFarbeAus();
        a.gibAlterAus();
        a.fahre();
    }
}
