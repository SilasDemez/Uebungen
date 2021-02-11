package fallmerayer.patterns.composite;

public class Application {
    public static void main(String[] args) {

        Inhalt inhalt1 = new Inhalt("Save Your Tears", "The Weekend", "After Hours", 2021);     // lied als Inhalt setzten
        Inhalt inhalt2 = new Inhalt("34+35", "Ariana Grande", "Positions",2020);    // lied als Inhalt setzen
        Inhalt inhalt3 = new Inhalt("Anyone", "Justin Bieber", "Anyone", 2020);     // lied als Inhalt setzen


        KleineSchachtel kleineSchachtel1 = new KleineSchachtel();   // kleine Schachtel erstellen

        kleineSchachtel1.addInhalt(inhalt1);    // Erstes Lied in die kleine Schachtel geben
        kleineSchachtel1.addInhalt(inhalt2);    // Zweites Lied in die kleine Schachtel geben


        GrosseSchachtel grosseSchachtel1 = new GrosseSchachtel();   // Große Schachtel erstellen

        grosseSchachtel1.addSchachtel(kleineSchachtel1);    // Die kleine Schachtel in die große geben


        GrosseSchachtel grosseSchachtel2 = new GrosseSchachtel();   // Noch eine große Schachtel erstellen

        grosseSchachtel2.addSchachtel(grosseSchachtel1);    // In die zweite große Schachtel die erste große Schachtel geben


        KleineSchachtel kleineSchachtel2 = new KleineSchachtel();   // eine zweite kleine Schachtel erstellen
        kleineSchachtel2.addInhalt(inhalt3);    // Drittes Lied in die zweite kleine Schachtel geben

        grosseSchachtel2.addSchachtel(kleineSchachtel2);    // Die zweite kleine Schachtel in die zweite große Schachtel geben


        System.out.println("Inhalt der kleinen Schachtel:\n " + kleineSchachtel1.getInhalt());
        System.out.println("Inhalt der ersten großen Schachtel:\n " + grosseSchachtel1.getInhalt());
        System.out.println("Inhalt der zweiten großen Schachtel:\n" + grosseSchachtel2.getInhalt());
    }
}
