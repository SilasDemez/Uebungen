package fallmerayer.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Kleineschachtel contains an arraylist that contains several Inhalte
 */
public class KleineSchachtel extends Schachtel{

    private List<Inhalt> inhalte;

    public KleineSchachtel(){
        this.inhalte = new ArrayList<>();
    }

    public void addInhalt(Inhalt inhalt){
        inhalte.add(inhalt);
    }

    @Override
    public String getInhalt() {
        return inhalte.toString();
    }

    @Override
    public String toString() {
        return "KleineSchachtel{" +
                "inhalte=" + inhalte +
                '}';
    }
}
