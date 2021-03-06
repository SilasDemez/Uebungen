package fallmerayer.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * GrosseSchachtel has an arraylist that contains several Kleineschachteln or Großeschachteln
 */
public class GrosseSchachtel extends Schachtel{
    private List<Schachtel> schachteln;

    public GrosseSchachtel(){
        this.schachteln = new ArrayList<>();
    }

    public void addSchachtel(Schachtel schachtel){
        schachteln.add(schachtel);
    }

    @Override
    public String getInhalt() {
        return schachteln.toString();
    }

    @Override
    public String toString() {
        return "GrosseSchachtel{" +
                "schachteln=" + schachteln +
                '}';
    }
}
