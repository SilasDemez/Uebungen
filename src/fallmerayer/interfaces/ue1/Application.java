public class Application {
    public static void main(String[] args) {
        Preisabfrage test = new Preisabfrage();
        Ort ort1 = new Ort("Milland");
        Ort ort2 = new Ort("Brixen");
        System.out.println(test.getFahrpreis(ort1,ort2));
        System.out.println(test.getRueckfahrpreis(ort1,ort2));
    }
}
