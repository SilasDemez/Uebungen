package fallmerayer.interfaces;

public class Preisabfrage extends Fahrplan implements EinfacheFahrt, HinUndRueckFahrt{

    @Override
    public int getFahrpreis(Ort start, Ort ziel) {

        return this.getPreis(new Ort[]{start,ziel});
    }

    @Override
    public int getRueckfahrpreis(Ort start, Ort ziel) {

        return this.getPreis(new Ort[]{ziel,start,ziel});
    }
}
