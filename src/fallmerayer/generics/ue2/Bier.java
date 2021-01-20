package fallmerayer.generics.ue2;

public class Bier extends Getraenk{
    String brauerei;    // contains the name of the beers brewery

    // Constructor with brewery as parameter
    Bier(String brauerei){
        this.brauerei = brauerei;
    }

    // returns the name of the brewery (String)
    public String getBrauerei() {
        return brauerei;
    }

    // When you print the content of the beer
    // this function gets called
    @Override
    public String toString() {
        return "Bier{" +
                "brauerei='" + brauerei + '\'' +
                '}';
    }
}
