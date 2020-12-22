package fallmerayer.generics.ue2;

// T (Getraenk) is a generification of wine and beer
public class Flasche<T extends Getraenk> {
    T inhalt;   //contains the content of the bottle (wine or beer)

    // checks if bottle is empty
    Boolean istLeer(){
        if (inhalt == null)
            return false;
        else
            return true;
    }

    // fills the bottle with T (wine or beer)
    void fuellen(T inhalt){
        this.inhalt = inhalt;
    }

    // empties the bottle and returns its content
    T leeren(){
        inhalt = null;
        return inhalt;
    }
}
