package fallmerayer.enums;

import java.util.ArrayList;

/**
 * <h1>Enum CandyType</h1>
 *
 * Contains 7 enums for types of candy
 * Also contains 1 enum for triggering an error message
 */
public enum CandyType {
    CARAMELS(9),
    CHOCOLATE(5),
    GUMMIES(4),
    LICORICE(3),
    LOLLIPOPS(2),
    CHEWING_GUMS(3),
    COTTON_CANDY(1),
    ERROR;

    private int candy_addiction;

    // Konstruktor mit Parameter
    CandyType(int candy_addiction){
        this.candy_addiction = candy_addiction;
    }

    // Konstruktor ohne Parameter
    // Für das Enum "ERROR"
    CandyType(){
    }

    public static CandyType fromName(String input) {
        for (CandyType candy : CandyType.values()){
            if (candy.toString().equals(input.toUpperCase()))
                return candy;
        }
        return ERROR;
    }

    public static CandyType random(){
        int zahl = (int) (Math.random()*(7-1)+1);

        return CandyType.values()[zahl];
    }

    /**
     * Method returns the
     */
    public int addictiveQuality(){
        return candy_addiction;
    }

    public CandyType next(){
        CandyType returnCandy = null;
        for(CandyType candy : CandyType.values()){
            int prev = 10;

            if (candy_addiction == 9)
                return CARAMELS;

            if (candy_addiction < candy.addictiveQuality()) {
                if (candy.addictiveQuality() <= prev){
                    prev = candy.candy_addiction;
                    returnCandy = candy;
                }
            }


        }

        return returnCandy;
    }
}
