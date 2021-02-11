package fallmerayer.patterns.composite;

public class Application {
    public static void main(String[] args) {

        Inhalt inhalt1 = new Inhalt("Save Your Tears", "The Weekend", "After Hours", 2021);
        Inhalt inhalt2 = new Inhalt("34+35", "Ariana Grande", "Positions",2020);


        KleineSchachtel kleineSchachtel1 = new KleineSchachtel();

        kleineSchachtel1.addInhalt(inhalt1);
        kleineSchachtel1.addInhalt(inhalt2);


        GrosseSchachtel grosseSchachtel1 = new GrosseSchachtel();

        grosseSchachtel1.addSchachtel(kleineSchachtel1);

        System.out.println(kleineSchachtel1.getInhalt());
        System.out.println(grosseSchachtel1.getInhalt());
    }
}
