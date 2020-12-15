public class AutoHaendler {
        public static void main (String[] args) {
            GebrauchtAuto auto1 = new GebrauchtAuto(20000,2002,"Audi TT",70000);
            System.out.println("Preis:"+ auto1.getPreis());
            Auto auto2 = auto1;
            System.out.println("Preis:"+ auto2.getPreis());
        }
    }
