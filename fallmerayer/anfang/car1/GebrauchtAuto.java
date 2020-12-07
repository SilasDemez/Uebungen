package it.fallmerayer.Programmierübungen;

public class GebrauchtAuto extends Auto{

    int kilometer;

    @Override
    public double getPreis(){
        int prozent_von_preis = 100- ((kilometer/ 20_000) * 10);
        //System.out.println("Prozent von Preis: " + prozent_von_preis);
        double preis = neuwagenpreis * (prozent_von_preis * 0.01);
        //System.out.println("Preis: " + preis);
        if (preis <= 2000)
            return 2000.0;
        else
            return preis;
    }

    public GebrauchtAuto(double neuwagenpreis, int baujahr, String modell, int kilometer) {
        super(neuwagenpreis,baujahr,modell);    //Defaultkonstruktor von Auto aufrufen
        this.kilometer = kilometer;
    }
}
