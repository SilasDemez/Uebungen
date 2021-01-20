package fallmerayer.generics.ue2;

public class Wein extends Getraenk{
    String herkunft;    // contains the name of the wines origin

    // Constructor with origin as parameter
    Wein(String herkunft){
        this.herkunft = herkunft;
    }

    // returns the name of the origin (String)
    public String getHerkunft(){
        return herkunft;
    }

    // When you print the content of the wine
    // this function gets called
    @Override
    public String toString() {
        return "Wein{" +
                "herkunft='" + herkunft + '\'' +
                '}';
    }
}
